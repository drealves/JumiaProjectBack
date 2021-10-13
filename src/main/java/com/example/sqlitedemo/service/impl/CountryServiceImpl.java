package com.example.sqlitedemo.service.impl;

import com.example.sqlitedemo.domain.Country;
import com.example.sqlitedemo.domain.Customer;
import com.example.sqlitedemo.repository.CountryRepository;
import com.example.sqlitedemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Iterable<Country> realAllCountry() {
        return countryRepository.findAll();
    }

    @Override
    public String createCountry(Country country) {
        try {
            countryRepository.save(country);
            return "saved";

        } catch (Exception e){

            throw e;
        }
    }
}
