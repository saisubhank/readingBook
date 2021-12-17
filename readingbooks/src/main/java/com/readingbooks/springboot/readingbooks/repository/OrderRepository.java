package com.readingbooks.springboot.readingbooks.repository;

import com.readingbooks.springboot.readingbooks.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends jpaRepository<Order,Long>{


    List<Order> findAll();
}
