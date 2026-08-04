package com.project.service;


import org.springframework.stereotype.Service;

import com.project.model.Customer;
import com.project.repository.CustomerRepository;

@Service 
public class CustomerService {
    // injeção de dependencia 
    private final CustomerRepository repository ;
    
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer createCustomer(Customer customer){
        try {
            if(repository.findByEmail(customer.getEmail()).isPresent()){
                throw new IllegalArgumentException("Email já cadastrado") ;
            }   
        } catch (EmailNotFound e) {
                
        }

        repository.save(customer) ;
    }


    
}