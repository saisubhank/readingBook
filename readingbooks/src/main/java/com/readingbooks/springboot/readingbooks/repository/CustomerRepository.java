package com.readingbooks.springboot.readingbooks.repository;

import com.readingbooks.springboot.readingbooks.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends jpaRepository<Customer,Long>{
    void deleteById();

     List<Customer> findAll();


     Customer save(Customer customer);
}
