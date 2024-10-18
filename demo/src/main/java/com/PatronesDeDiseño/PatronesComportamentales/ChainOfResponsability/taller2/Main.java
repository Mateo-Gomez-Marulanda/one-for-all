package com.PatronesDeDiseño.PatronesComportamentales.ChainOfResponsability.taller2;

abstract class DiscountHandler{
    protected DiscountHandler nextHandler;

    public void setNextHandler(DiscountHandler nexHandler) {
        this.nextHandler = nexHandler;
    }

    public void applyDiscount(double amount){
        if(amount != 0){
            nextHandler.applyDiscount(amount);
        }
    }
}

class BasicDiscountHandler extends DiscountHandler{
    @Override
    public void applyDiscount(double amount){
        if(amount < 100 ){
            double discount = amount - amount*(5.0/100);
            System.out.println(discount);
        } else{
            super.applyDiscount(amount);
        }
    }
}

class MediumDiscountHandler extends DiscountHandler{

    @Override
    public void applyDiscount(double amount){
        if(amount > 100 && amount <500 ){
            double discount = amount - amount*(10.0/100);
            System.out.println(discount);
        } else {
            super.applyDiscount(amount);
        }
    }
}

class PremiumDiscountHandler extends DiscountHandler{
    @Override
    public void applyDiscount(double amount){
        if(amount > 500 ){
            double discount = amount - amount*(15.0/100);
            System.out.println(discount);
        }
    }
}

public class Main {

    public static DiscountHandler getChain(){
        DiscountHandler basicDiscountHandler = new BasicDiscountHandler();
        DiscountHandler mediumDiscountHandler = new MediumDiscountHandler();
        DiscountHandler premiumDiscountHandler = new PremiumDiscountHandler();

        basicDiscountHandler.setNextHandler(mediumDiscountHandler);
        mediumDiscountHandler.setNextHandler(premiumDiscountHandler);

        return basicDiscountHandler;
    }
    
    
    public static void main(String[] args) {
        DiscountHandler chain = getChain();

        chain.applyDiscount(50);
        chain.applyDiscount(150);
        chain.applyDiscount(550
        );

    }
}
