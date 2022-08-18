package com.bank.assessment.repository;

import com.bank.assessment.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByName(String name);
}
