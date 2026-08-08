package com.project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.exception.CustomerNotFound;
import com.project.exception.PayementNotFound;
import com.project.model.Customer;
import com.project.model.Payment;
import com.project.repository.PaymentRepository;

@Service
public class PaymentService {
    // injeção dependencia
    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }
    
    public Payment createPayment(Payment payment){
        try {
            
        } catch (PayementNotFound e) {
                
        }

        repository.save(payment) ;
        return payment ;
    }

    public Iterable<Payment> findAllPayment(){
        return repository.findAll() ;
    } 

    public Payment findPaymentById(Integer id){
        Optional<Payment> payment = repository.findById(id) ;

        return payment.orElseThrow(CustomerNotFound::new) ;
    }

    



}
