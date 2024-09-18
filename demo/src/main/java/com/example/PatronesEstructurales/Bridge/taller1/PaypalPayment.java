package com.example.PatronesEstructurales.Bridge.taller1;

public class PaypalPayment implements IPaymentPlataform {
    
    @Override
    public void proccesPayment(){
        System.out.println("Processing payment using Paypal");
    }
}
