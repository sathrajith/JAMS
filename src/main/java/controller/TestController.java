package com.crm.JAMS.controller;

import com.crm.JAMS.entity.Customer;
import com.crm.JAMS.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/test")
    public String testDatabase() {
        Customer customer = new Customer();
        customer.setName("sathur");
        customer.setEmail("sathru@example.com");
        customer.setPhone("1234567890");
        customerRepository.save(customer);
        return "Customer saved successfully!";
    }
}
