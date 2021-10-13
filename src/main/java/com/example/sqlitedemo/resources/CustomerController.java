package com.example.sqlitedemo.resources;
import com.example.sqlitedemo.service.CustomerService;
import com.example.sqlitedemo.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @CrossOrigin
    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public String createCustomer(@RequestBody Customer Customer){
        return customerService.createCustomer(Customer);
    }

    @CrossOrigin
    @RequestMapping(value = "customer", method = RequestMethod.GET)
    public Iterable<Customer> info(){ return customerService.readCustomers();}








}
