package com.example.Builder.taller1;

public class Pizza {
    private String dough;
    private String cheese;
    private String souce;
    private String toppins;
    
    

    public Pizza(String dough, String cheese, String souce, String toppins) {
        this.dough = dough;
        this.cheese = cheese;
        this.souce = souce;
        this.toppins = toppins;
    }
    public String getDough() {
        return dough;
    }
    public void setDough(String dough) {
        this.dough = dough;
    }
    public String getCheese() {
        return cheese;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public String getSouce() {
        return souce;
    }
    public void setSouce(String souce) {
        this.souce = souce;
    }
    public String getToppins() {
        return toppins;
    }
    public void setToppins(String toppins) {
        this.toppins = toppins;
    }

    @Override
    public String toString() {
        return "Pizza [dough=" + dough + ", cheese=" + cheese + ", souce=" + souce + ", toppins=" + toppins + "]";
    } 

    

    
    
}
