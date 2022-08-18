package com.bank.assessment.repository;

import com.bank.assessment.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByBranch_Code(Integer code);
    List<Loan> findByCustomer_CustomerNumber(Long customerNumber);
    Optional<Loan> findByLoanNumber(Long customerNumber);
}
