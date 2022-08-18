package com.bank.assessment;

import com.bank.assessment.domain.AccountType;
import com.bank.assessment.exception.NotFoundException;
import com.bank.assessment.repository.AccountRepository;
import com.bank.assessment.service.AccountService;
import com.bank.assessment.domain.Account;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Date;

import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
@Transactional
public class AccountServiceTest {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountService accountService;

    @DisplayName("Returning saved Account from service layer")
    @Test
    void getAccountById_forSavedAccount_isReturned() {
        //given
        Long accNo = anyLong();
        Long balance = anyLong();
        Account savedAccount = accountRepository.save(Account.builder().accountNumber(accNo).openingDate(new Date()).balance(balance).accountType(AccountType.SAVINGS_ACCOUNT).active(true).build());

        //when
        Account retrievedAccount = accountService.getAccount(accNo);

        //then
        then(retrievedAccount.getAccountType()).isEqualTo(savedAccount.getAccountType());
        then(retrievedAccount.getBalance()).isEqualTo(savedAccount.getBalance());
        then(retrievedAccount.getId()).isNotNull();
    }

    @Test
    void getAccountById_whenMissingAccount_notFoundExceptionThrown() {
        //given
        Long id = 1234l;
        //when
        Throwable throwable = catchThrowable(() -> accountService.getAccount(id));

        //then
        BDDAssertions.then(throwable).isInstanceOf(NotFoundException.class);
    }

}



