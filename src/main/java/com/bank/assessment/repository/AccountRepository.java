package com.bank.assessment.repository;

import com.bank.assessment.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByCustomer_CustomerNumber(Integer customerNumber);
    Optional<Account> findByAccountNumber(Long accountNumber);
    List<Account> findByAccountNumberAndActive(String accountNumber, Boolean active);
}
