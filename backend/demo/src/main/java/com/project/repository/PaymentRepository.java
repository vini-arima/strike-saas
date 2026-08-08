package com.project.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Customer;
import com.project.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

     Optional <Customer> findByAmount(double amount); 

     Optional<Payment> findById(Integer id);

    
} 