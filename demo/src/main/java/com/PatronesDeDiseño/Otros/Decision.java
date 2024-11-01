package com.PatronesDeDiseño.Otros;

class Fulanito {
    private String rol;

    public Fulanito(String rol) {
        this.rol = rol;
    }

    public void verificarRol() {
        String verificarRol = rol.toUpperCase();

        if (verificarRol.equals("EMPLEADO")) {
            System.out.println("Usted es un empleado");
        } else if (verificarRol.equals("JEFE")) {
            System.out.println("Usted es el jefe");
        } else {
            throw new IllegalArgumentException("Error: rol no identificado");
        }
    }

    public void setRol(String rol) {
        this.rol = rol;
        verificarRol();
    }
}

public class Decision {
    public static void main(String[] args) {
        Fulanito fulano = new Fulanito("empleado");
        fulano.verificarRol();

        fulano.setRol("jefe");
    }
}
