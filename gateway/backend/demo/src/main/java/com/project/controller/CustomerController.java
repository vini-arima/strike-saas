package com.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.service.CustomerService;

@RestController 
public class CustomerController {
    private final CustomerService customerService ;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService ;
    }

}
