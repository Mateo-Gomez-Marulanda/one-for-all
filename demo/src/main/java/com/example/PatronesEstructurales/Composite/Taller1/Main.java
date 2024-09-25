package com.example.PatronesEstructurales.Composite.Taller1;
//taller 20/09/2024
import java.util.List;
import java.util.ArrayList;

//se crea interfaz general
interface Componente{
    String obtenerNombre();
    double obtenerSalario();
}

//se crea clase de obejetos simples
class Empleado implements Componente{
    private double salario;
    private String nombre;
    
    public Empleado(double salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }
    
    @Override
    public String obtenerNombre(){
        return nombre;
    }

    @Override
    public double obtenerSalario(){
        return salario;
    }
}

//se crea clase de objetos compuestos
class Manager implements Componente{
    private String nombre;
    private double salario;
    private List<Componente> empleados = new ArrayList<>();

    public Manager(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void agregarEmpleado(Componente empleado){
        empleados.add(empleado);
    }

    public double obtenerSalarioTotalEmpleados(){
        int salarioTotal = 0;
        for (Componente empleado : empleados) {
            salarioTotal += empleado.obtenerSalario();
        }
        return salarioTotal;
    }

    @Override
    public double obtenerSalario(){
        return salario;
    }

    @Override
    public String obtenerNombre(){
        return nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        //creacion de empleados 
        Componente empleado1 = new Empleado(200, "Pepe Perez");
        Componente empleado2 = new Empleado(200, "Marta Martinez");

        //creacion de manager con la lista de los empleados
        Manager manager = new Manager("Juan", 300);
        manager.agregarEmpleado(empleado2);
        manager.agregarEmpleado(empleado1);

        //creacion de magager con la lista de los manager 
        Manager managerPrincipal = new Manager("Angela Aguila", 400);
        managerPrincipal.agregarEmpleado(manager);
        managerPrincipal.obtenerNombre();
        managerPrincipal.obtenerSalario();
        managerPrincipal.obtenerSalarioTotalEmpleados();
        
        System.out.println(managerPrincipal.obtenerSalario());
        System.out.println(managerPrincipal.obtenerSalarioTotalEmpleados());
    }
}
