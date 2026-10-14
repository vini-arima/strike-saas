package com.project.repository;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import com.project.model.Customer;
import com.project.model.Payment;

public interface PaymentRepository extends ListCrudRepository<Payment, Integer>{

     Optional <Customer> findByAmount(double amount); 

    
} 