package com.PatronesDeDiseño.PatronesEstructurales.Decorator.taller0;
//ejemplo 25/09/2024

//se crea abstrac general
abstract class Cafe {
    public abstract String getDescripcion();

    public abstract double precio();
}

// clase base
class CafeSimple extends Cafe {
    @Override
    public String getDescripcion() {
        return "Cafe simple ";
    }

    @Override
    public double precio() {
        return 10.0;
    }
}

// clase abstracta decorator
abstract class DecoratorCafe extends Cafe {
    protected Cafe cafe;

    public DecoratorCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public abstract String getDescripcion();
}

// decorador concreto
class ConLeche extends DecoratorCafe {

    public ConLeche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " con leche ";
    }

    @Override
    public double precio() {
        return cafe.precio() + 2.0;
    }
}

class ConCrema extends DecoratorCafe {

    public ConCrema(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " con crema ";
    }

    @Override
    public double precio() {
        return cafe.precio() + 3.0;
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new CafeSimple();
        System.out.println(cafe.getDescripcion() + cafe.precio());

        Cafe cafeConLeche = new ConLeche(new CafeSimple());
        System.out.println(cafeConLeche.getDescripcion() + cafeConLeche.precio());

        Cafe cafeConTodo = new ConCrema(new ConLeche(new CafeSimple()));
        System.out.println(cafeConTodo.getDescripcion() + cafeConTodo.precio());
    }
}
