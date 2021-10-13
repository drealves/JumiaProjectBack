package com.example.sqlitedemo.service;

import com.example.sqlitedemo.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Iterable<Customer> readCustomers();
    String createCustomer(Customer Customer);

}
