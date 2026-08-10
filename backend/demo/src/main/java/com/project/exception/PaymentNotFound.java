package com.project.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) 
public class PaymentNotFound extends RuntimeException {
    public PaymentNotFound(String mensage){
        super(mensage) ;
    }
}
