package com.bank.assessment;

import com.bank.assessment.domain.AccountType;
import com.bank.assessment.service.AccountService;
import com.bank.assessment.domain.Account;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

@WebMvcTest
public class AccountControllerBaseClass {
    @MockBean
    private AccountService accountService;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.mockMvc(mockMvc);

        //given
        given(accountService.getAccount(anyLong())).willReturn(
                Account.builder()
                        .id(anyLong())
                        .openingDate(new Date())
                        .active(true)
                        .accountNumber(anyLong())
                        .accountType(AccountType.SAVINGS_ACCOUNT)
                        .balance(anyLong())
                        .build()
        );
    }
}
