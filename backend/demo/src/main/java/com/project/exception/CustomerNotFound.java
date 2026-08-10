package com.project.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) 
public class CustomerNotFound extends RuntimeException {
    
    public CustomerNotFound(String mensage){
         super(mensage) ;
    }

    public CustomerNotFound(){
        super("Clinte não encontrado") ;       
    }
}
