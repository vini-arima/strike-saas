package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.dto.PaymentDTO;
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
    
    public PaymentDTO save(PaymentDTO dto){
        Payment payment = dto.toModel() ; 

        Payment saved = repository.save(payment) ;

        return new PaymentDTO(saved) ;

    }


    public List<PaymentDTO> findAllPayment(){
        return repository.findAll().stream().map(PaymentDTO::new ).toList() ;
    } 


}
