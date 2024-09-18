package com.example.Otros;

public class ejercisio2 {
    //fabrica de transacciones
    public interface ITransactionFactory {
        void sendPayment(double amount);

        void makePayment(double amount);

    }

    // Clase PayPal para procesar pagos
    class PayPal implements ITransactionFactory {
        public void sendPayment(double amount) {
            System.out.println("PayPal: Payment of $" + amount + " processed.");
        }

        public void makePayment(double amount) {
            System.out.println("Paypal: Payment of $" + amount + " processed.");
        }

    }

    // Clase Stripe para procesar pagos
    class Stripe implements ITransactionFactory {
        public void makePayment(double amount) {
            System.out.println("Stripe: Payment of $" + amount + " processed.");
        }

        public void sendPayment(double amount) {
            System.out.println("Stripe: Payment of $" + amount + " processed.");
        }

    }



}
