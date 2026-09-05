package com.project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.exception.CustomerNotFound;
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
        if(repository.findByEmail(customer.getEmail()).isPresent()){
                throw new IllegalArgumentException("Email já cadastrado") ;
        }   
        
        return repository.save(customer) ;
    }

    public Iterable<Customer> findAllCustomer(){
        return repository.findAll() ;
    } 

    public Customer findCustomerByID(Integer id){
        Optional<Customer> customer = repository.findById(id) ; 
        
        return customer.orElseThrow(CustomerNotFound::new) ;
        
    }
}


    
