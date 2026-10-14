package com.project.dto;

import com.project.model.Payment;
import com.project.model.Customer;
import com.project.model.PaymentMethod ;
import com.project.model.PaymentStatus ;

public record PaymentDTO(
         Integer id ,
         double amount ,
         PaymentStatus status ,
         PaymentMethod method ,
         Customer customer  

) {     
        // Construtor para converter da Model para o DTO
        public PaymentDTO(Payment payment){
            this(payment.getId(), payment.getAmount(), payment.getStatus(), payment.getMethod(), payment.getCustomer()) ;
        }

        // Método para converter o DTO de volta para a Model
        public Payment toModel(){
            return new Payment(this.id, this.amount, this.status, this.method, this.customer);

        }
}


      
   


