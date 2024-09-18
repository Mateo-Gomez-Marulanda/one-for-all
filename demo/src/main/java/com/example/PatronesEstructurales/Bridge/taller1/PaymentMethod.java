package com.example.PatronesEstructurales.Bridge.taller1;

public abstract class PaymentMethod {
    protected IPaymentPlataform paymentPlataform;

    public PaymentMethod(IPaymentPlataform paymentPlataform) {
        this.paymentPlataform = paymentPlataform;
    }

    void usePlataform(){
        paymentPlataform.proccesPayment();
    }
}
