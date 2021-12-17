package com.readingbooks.springboot.readingbooks.serviceImpl;

import com.readingbooks.springboot.readingbooks.entity.Order;
import com.readingbooks.springboot.readingbooks.repository.OrderRepository;
import com.readingbooks.springboot.readingbooks.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        super();
        this.orderRepository=orderRepository;
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }
}
