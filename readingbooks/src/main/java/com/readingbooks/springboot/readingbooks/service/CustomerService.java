package com.readingbooks.springboot.readingbooks.service;

import com.readingbooks.springboot.readingbooks.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    Customer savecustomer(Customer customer);

    void deleteCustomerById(Long id);
}
