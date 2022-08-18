package com.bank.assessment.repository;

import com.bank.assessment.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccount_AccountNumber(String accountNumber);
    List<Transaction> findByAmountBetween(Long minAmount, Long maxAmount);
}
