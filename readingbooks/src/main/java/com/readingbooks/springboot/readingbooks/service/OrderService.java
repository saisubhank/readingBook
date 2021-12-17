package com.readingbooks.springboot.readingbooks.service;

import com.readingbooks.springboot.readingbooks.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrder();
}
