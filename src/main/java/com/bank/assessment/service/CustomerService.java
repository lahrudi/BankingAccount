package com.bank.assessment.service;

import com.bank.assessment.domain.Account;
import com.bank.assessment.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
@Slf4j
@Service
public class CustomerService {

    // Read
    List<Customer> findAllCustomers(){return null;}

    Customer findCustomer(String param){return null;};

    public Customer createCustomer(){return null;};

    public boolean removeCustomer(){return false;};

    public Customer getCustomerOfAccount(Account account){return null;};

    public Customer findCustomerByID(int id) {return null;};

    public List<Customer> findCustomersByName(String name) {return null;};
}