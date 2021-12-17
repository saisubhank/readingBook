package com.readingbooks.springboot.readingbooks.controller;


import com.readingbooks.springboot.readingbooks.entity.Books;
import com.readingbooks.springboot.readingbooks.entity.Customer;
import com.readingbooks.springboot.readingbooks.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
	private OrderService orderService;
    private Customer customer;
    private Books books;

    public OrderController(OrderService orderService){
        super();
        this.orderService = orderService;
    }
    @GetMapping("/order/list")
    public String listOrder(Model model){
        model.addAttribute("order",orderService.getAllOrder());
        return listOrder(model);
    }
    @PostMapping("/order/final")
    public String orderFinal(Books books , Customer customer){
        
        return orderFinal(books,customer);
    }





}
