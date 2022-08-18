package com.bank.assessment.service;

import com.bank.assessment.domain.Account;
import com.bank.assessment.exception.NotFoundException;
import com.bank.assessment.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {

    final AccountRepository accountRepository;

    public Account saveAccount(Account account) throws Exception{
        return accountRepository.save(account);
    }

    public void removeAccount(Account account) throws Exception {
        accountRepository.delete(account);
    }

    public Account getAccount(Long accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber).orElseThrow(() -> new NotFoundException(accountNumber));
    }

    public List<Account> getAccountsOfCustomer(Integer customerNo) {
        return accountRepository.findByCustomer_CustomerNumber(customerNo);
    }

    public String getAccountDetails(Long accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber).toString();
    }

    public void deposit(Account account, Long amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Balance after deposit: " + account.getBalance());
    }

    public void withdrawal(Account account, Long amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } else {
            System.out.println("Your balance is less than " + amount + " Transaction failed...!!");
        }
    }
}