package com.alint.spring6learning.spring6restmvc.controller;

import com.alint.spring6learning.spring6restmvc.model.Customer;
import com.alint.spring6learning.spring6restmvc.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") UUID id){
        return customerService.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.listCustomers();
    }
}
