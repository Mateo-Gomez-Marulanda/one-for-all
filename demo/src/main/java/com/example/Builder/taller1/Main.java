package com.example.Builder.taller1;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder builder = new PizzaBuilder();
        Pizza pizza = builder.setCheese("Mozarella").
                            setDough("wheat").
                            setSouce("Pesto").
                            setToppins("salami").
                            build();

        System.out.println(pizza.toString());
    }
}
