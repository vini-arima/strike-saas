package com.project.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
        
    private int id ;
    private String name ;
    private String email ;
    
    // Lista de Clientes para cada pagamento
    private List<Customer> customers = new ArrayList<>() ;

    public Customer(){

    }

    public Customer(int id, String name, String email, List<Customer> customers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    } 

    

    


    
}