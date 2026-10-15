package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.dto.CustomerDTO;
import com.project.model.Customer;
import com.project.repository.CustomerRepository;

@Service 
public class CustomerService {
    // injeção de dependencia 
    private final CustomerRepository repository ;
    
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerDTO save(CustomerDTO  dto){
        Customer customer = dto.toModel() ; 

        Customer saved = repository.save(customer) ;

        return new CustomerDTO(saved) ;
    }

    public List<CustomerDTO> findAllCustomer(){
        return repository.findAll().stream().map(CustomerDTO::new).toList() ;
    } 

}


    
