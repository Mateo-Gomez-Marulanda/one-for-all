package com.PatronesDeDiseño.PatronesEstructurales.Adapter.taller2;
//ejercicio 4 11/09/2024
public class Main {
    public static void main(String[] args) {
        Paypal paypal = new Paypal();
        Stripe stripe = new Stripe();

        ISendingAdapter paypalAdapter = new PaypalAdapter(paypal);
        IMakePaymentAdapter stripeAdapter = new StripeAdapter(stripe);
        
        Cliente cliente = new Cliente(paypal,stripe);

        cliente.realizarEnvio(paypalAdapter.adaptarEnvio());
        cliente.hacerTransaccion(stripeAdapter.AdaptarTransaccion());
    }
}
