package com.PatronesDeDiseño.PatronesEstructurales.Adapter.taller2;

public class StripeAdapter implements IMakePaymentAdapter{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    public void AdaptarTransaccion(double amount){
        stripe.makePayment(amount);
    }
}
