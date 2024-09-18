package com.example.PatronesEstructurales.Bridge.taller1;

public class Main {
    public static void main(String[] args) {
        
      IPaymentPlataform paypal = new PaypalPayment();

      PaymentMethod terminal = new TerminalPayment(paypal);

      terminal.usePlataform();


}
}
