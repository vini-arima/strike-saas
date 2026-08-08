package com.project.service;

import com.project.exception.PayementNotFound;
import com.project.model.Payment;
import com.project.repository.PaymentRepository;

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

    



}
