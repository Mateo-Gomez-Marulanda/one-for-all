package com.PatronesDeDiseño.PatronesEstructurales.Bridge.taller1;

public class MobilePOS extends PaymentMethod{
    
    public MobilePOS(IPaymentPlataform paymentPlataform){
        super(paymentPlataform);
    }
}
