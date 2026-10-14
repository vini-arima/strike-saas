package com.project.dto;

import com.project.model.Customer;

public record CustomerDTO(
         Integer id ,
         String name,
         String email 
) {
    // Construtor para converter da Model para o DTO
        public CustomerDTO(Customer customer){
            this(customer.getId(), customer.getName(), customer.getEmail()) ;
        }

        // Método para converter o DTO de volta para a Model
        public Customer toModel(){
            return new Customer(this.id, this.name , this.email);

        }
}

