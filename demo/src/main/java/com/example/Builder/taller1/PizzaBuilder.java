package com.example.Builder.taller1;

public class PizzaBuilder {
    private String dough;
    private String cheese;
    private String souce;
    private String toppins;

    public PizzaBuilder setDough(String dough){
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setCheese(String cheese){
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setSouce(String souce){
        this.souce = souce;
        return this;
    }

    public PizzaBuilder setToppins(String toppins){
        this.toppins = toppins;
        return this;
    }

    public Pizza build(){
        return new Pizza(this.dough,this.cheese , this.souce, this.toppins); 
    }

}
