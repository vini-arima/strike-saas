package com.project.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.project.model.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends ListCrudRepository<Customer , Integer> {
    Optional <Customer> findByEmail(String email);
   

} 