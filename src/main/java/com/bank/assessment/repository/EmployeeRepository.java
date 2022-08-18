package com.bank.assessment.repository;

import com.bank.assessment.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByBranch_Code(Integer code);
    Optional<Employee> findByName(String name);
}
