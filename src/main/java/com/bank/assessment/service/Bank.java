package com.bank.assessment.service;

import com.bank.assessment.domain.*;
import java.util.List;

public interface Bank {

    boolean add(Customer customer);
    boolean add(Employee employee);
    boolean add(Account account);
    boolean add(Loan loan);
    boolean add(Branch branch);

    boolean add(Transaction transaction);

    List<Employee>findAllEmployees();
    Employee findEmployee(String param);

    List<Account>findAccountsOfCustomer();
    List<Loan>findLoansOfCustomer();

    boolean update(Customer customer);
    boolean update(Employee employee);
    boolean update(Account account);
    boolean update(Loan loan);
    boolean update(Branch branch);

    boolean delete(Customer customer);
    boolean delete(Employee employee);
    boolean delete(Account account);
    boolean delete(Loan loan);
    boolean delete(Branch branch);
}

