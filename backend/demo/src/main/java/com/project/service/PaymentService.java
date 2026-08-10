package com.project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.exception.PaymentNotFound;
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
        
        if(repository.findByAmount(payment.getAmount()).isPresent()){
                 throw new IllegalArgumentException("O Valor do produto tá cadastrado") ;
        }
        
        return repository.save(payment) ;
    }

    public Iterable<Payment> findAllPayment(){
        return repository.findAll() ;
    } 

    public Payment findPaymentById(Integer id){
        Optional<Payment> payment = repository.findById(id) ;

        return payment.orElseThrow(PaymentNotFound::new) ;
    }

    



}
