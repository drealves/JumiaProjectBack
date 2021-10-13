package com.example.sqlitedemo.service.impl;

import com.example.sqlitedemo.domain.Country;
import com.example.sqlitedemo.domain.Customer;
import com.example.sqlitedemo.repository.CustomerRepository;
import com.example.sqlitedemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CountryServiceImpl countryService;

    @Override
    public Iterable<Customer> readCustomers(){

       Iterable<Customer> customerIterable = customerRepository.findAll();

       for (Customer customer : customerIterable){
           if (customer.getCountry() == null){
               Country defaultCountry = new Country();
               defaultCountry.setName("not assigned");
               defaultCountry.setRegex("not assigned");
               defaultCountry.setCode("not assigned");
               customer.setCountry(defaultCountry);
           }
       }

        return customerIterable;
    }

    @Override
    public String createCustomer(Customer customer){

        try {

            if (!customerRepository.existsByIdOrPhone(customer.getId(), customer.getphone())){

                Iterable<Country> countryList = countryService.realAllCountry();

                for (Country country : countryList){

                    String regex = country.getRegex();
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(customer.getphone());
                    Boolean state = matcher.matches();

                    if (state.equals(Boolean.TRUE)){

                        customer.setState(Boolean.TRUE);
                        customer.setCountry(country);
                        customerRepository.save(customer);
                        break;

                    }else {
                        customer.setState(Boolean.FALSE);
                        customerRepository.save(customer);
                    }
                }

                return "Customer record created successfully.";

            }else {

                return "This Phone number already exists in the database.";
            }
        }catch (Exception e){

            throw e;
        }
    }
}
