package com.PatronesDeDiseño.PatronesEstructurales.Bridge.taller1;

public class TerminalPayment  extends PaymentMethod{
    
    public TerminalPayment(IPaymentPlataform paymentPlataform){
        super(paymentPlataform);
    }

    @Override
    public void usePlataform(){
        paymentPlataform.proccesPayment();
    }
}
