package com.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Payment;
import com.project.service.PaymentService;

@RestController 
public class PayementController {
    private final PaymentService paymentService ;

    public PayementController(PaymentService paymentService){
        this.paymentService = paymentService ;
    }

}
