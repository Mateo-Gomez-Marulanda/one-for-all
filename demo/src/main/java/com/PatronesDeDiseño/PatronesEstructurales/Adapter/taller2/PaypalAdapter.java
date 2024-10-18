package com.PatronesDeDiseño.PatronesEstructurales.Adapter.taller2;

public class PaypalAdapter implements ISendingAdapter{
    private Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void adaptarEnvio( double amount){
        paypal.sendPayment(amount);
    }


}
   