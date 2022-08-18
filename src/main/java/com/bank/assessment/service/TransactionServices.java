package com.bank.assessment.service;

import com.bank.assessment.domain.Account;
import com.bank.assessment.domain.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
@Slf4j
@Service
public class TransactionServices {

    public List<Transaction> getTransactionsOfAccount(Account account) {
        return null;
    }

    public String getTransactionDetails(Transaction transaction) {
        return null;
    }

    @Transactional
    public boolean withdraw(Account account, BigDecimal amount) {
        return false;
    }

    @Transactional
    public boolean deposit(Account account, BigDecimal amount) {
        return false;
    }

    @Transactional
    public boolean transfer(Account from, Account to, BigDecimal amount) {
        return false;
    }

    List<Transaction> findTransactionsOfAccount() {
        return null;
    }

    List<Transaction> findTransactionsOfCustomer() {
        return null;
    }

    String getTransactionDetails() {
        return null;
    }
}