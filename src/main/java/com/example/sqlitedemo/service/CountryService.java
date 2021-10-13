package com.example.sqlitedemo.service;

import com.example.sqlitedemo.domain.Country;
import com.example.sqlitedemo.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {

    Iterable<Country> realAllCountry();
    String createCountry(Country country);
}
