package com.readingbooks.springboot.readingbooks.serviceImpl;

import com.readingbooks.springboot.readingbooks.entity.Customer;
import com.readingbooks.springboot.readingbooks.repository.CustomerRepository;
import com.readingbooks.springboot.readingbooks.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super();
    }

    @Override
    public List<Customer> getAllCustomer() {

        return customerRepository.findAll();
    }

    @Override
    public Customer savecustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {

        customerRepository.deleteById();
    }
}
