package com.example.sqlitedemo.service.impl;

import com.example.sqlitedemo.domain.Customer;
import com.example.sqlitedemo.repository.CustomerRepository;
import com.example.sqlitedemo.service.CustomerService;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.patterns.IVerificationRequired;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {

    private final static String DEFAULT_NAME = "andre";
    private final static String DEFAULT_PHONE = "(237)65052571";

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Before("")
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
}