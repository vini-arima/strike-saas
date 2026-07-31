package com.project.model;

public class Payment {

    private int id ;
    private double amount ;
    private PaymentStatus status ;
    private PaymentMethod method ;
    private Customer customer ;  

    public Payment(){

    }

    public Payment(int id, double amount, PaymentStatus status, PaymentMethod method, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.method = method;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    
}
