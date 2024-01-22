package com.alint.spring6learning.spring6restmvc.service;

import com.alint.spring6learning.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    public Customer getCustomerById(UUID id);
    public List<Customer> listCustomers();
}
