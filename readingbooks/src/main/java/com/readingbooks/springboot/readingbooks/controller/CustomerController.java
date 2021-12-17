package com.readingbooks.springboot.readingbooks.controller;

import com.readingbooks.springboot.readingbooks.entity.Customer;
import com.readingbooks.springboot.readingbooks.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
	private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        super();
        this.customerService = customerService;
    }
    @GetMapping("/customer/list")
    public String listCustomer(Model model){
        model.addAttribute("customer",customerService.getAllCustomer());
        return listCustomer(model);
    }

    @PostMapping("/customer/list/new")
    public String saveBook(@ModelAttribute("customer") Customer customer, Model model){
        model.addAttribute("customer",customer);
        customerService.savecustomer(customer);
        return "redirect:/customer/list";
    }
    @GetMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
        return "redirect:/customer/list";
    }
}
