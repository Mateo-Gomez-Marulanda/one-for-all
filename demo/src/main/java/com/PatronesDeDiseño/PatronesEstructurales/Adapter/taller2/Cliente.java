package com.PatronesDeDiseño.PatronesEstructurales.Adapter.taller2;
//ejercicio 4 11/09/2024

public class Cliente {

        private Paypal paypal;
        private Stripe stripe;
        
        public Cliente(Paypal paypal, Stripe stripe) {
            this.paypal = paypal;
            this.stripe = stripe;
        }

        public void realizarEnvio( double amount){
            paypal.sendPayment(amount);
        }

        public void hacerTransaccion( double amount){
            stripe.makePayment(amount);
        }

        
    
}
