package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Customer;
import java.util.Optional;


public interface CustomerRepository extends CrudRepository<Customer , Integer> {
    Optional <Customer> findByEmail(String email);
    Optional <Customer> findById(Integer id);
   

} 