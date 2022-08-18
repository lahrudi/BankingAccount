package com.bank.assessment.repository;

import com.bank.assessment.domain.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public interface BranchRepository extends JpaRepository<Branch, Long> {
    Optional<Branch> findByName(String name);
    Optional<Branch> findByCode(Integer code);
}
