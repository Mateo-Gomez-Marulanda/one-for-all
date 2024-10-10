package com.example.PatronesEstructurales.Adapter.taller4;

//pregunta 2 del preparcial 2 09/10/2024

abstract class GraficoVectorial{
    public abstract void renderizar();
}

class Circulo extends GraficoVectorial{
    @Override
    public void renderizar(){
        System.out.println("renderizando circulo");
    }
}

class Reactangulo extends GraficoVectorial{
    @Override
    public void renderizar(){
        System.out.println("renderizando rectangulo");
    }
}

class shape3DAdapter{
    private GraficoVectorial graficoVectorial;

    public shape3DAdapter(GraficoVectorial graficoVectorial) {
        this.graficoVectorial = graficoVectorial;
    }

    public void renderizarFigura3D(){
        graficoVectorial.renderizar();
    }
}

public class Main {
    public static void main(String[] args) {
        GraficoVectorial circulo = new Circulo();
        GraficoVectorial rectangulo = new Reactangulo();

        shape3DAdapter rectanguloAdapter = new shape3DAdapter(rectangulo);
        rectanguloAdapter.renderizarFigura3D();

        shape3DAdapter circuloAdapter = new shape3DAdapter(circulo);
        circuloAdapter.renderizarFigura3D();
    }
}
