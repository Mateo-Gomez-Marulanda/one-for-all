package com.PatronesDeDiseño.PatronesComportamentales.Strategy.taller0;

//ejemplo clase 25/10/2024

// interfaz para la creacion de estrategias 
interface TransportMethod {
    double calculateShippingCost();
}

// estrategias concretas
class AirTransport implements TransportMethod {

    private double weight;

    public AirTransport(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateShippingCost() {
        System.out.println("Precio de envio por aire es: " + weight * 10.0);
        return weight * 10.0;
    }
}

class SeaTransport implements TransportMethod {

    private double weight;

    public SeaTransport(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateShippingCost() {

        System.out.println("Precio de envio por mar es: " + weight * 5.0);
        return weight * 5.0;
    }
}

class LandTransport implements TransportMethod {

    private double weight;

    public LandTransport(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateShippingCost() {
        System.out.println("Precio de envio por tierra es: " + weight * 2.0);
        return weight * 2.0;
    }
}

// clase context la cual va usar las diferentes estrategias
class ShippingService {

    private TransportMethod transportMethod;

    // metodo para elegir entre las estrategias
    public double calculateShippingCost() {
        if (transportMethod != null) {
            return transportMethod.calculateShippingCost();
        } else {
            throw new IllegalArgumentException("\"Error: metodo de envio no es correcto\"");
        }
    }

    public void setTransportMethod(TransportMethod transportMethod) {
        this.transportMethod = transportMethod;
        calculateShippingCost();
    }

}

public class Main {
    public static void main(String[] args) {
        
        //implementar estrategias
        TransportMethod air = new AirTransport(45.0);
        TransportMethod land = new LandTransport(30.0);
        TransportMethod sea = new SeaTransport(23.0);

        //clase que cambia entre estrategias
        ShippingService service = new ShippingService();

        //metodo para cambias entre estrategias
        service.setTransportMethod(air);
        service.setTransportMethod(land);
        service.setTransportMethod(sea);
    }
}
