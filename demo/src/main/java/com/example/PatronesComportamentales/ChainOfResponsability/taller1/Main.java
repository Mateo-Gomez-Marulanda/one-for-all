package com.example.PatronesComportamentales.ChainOfResponsability.taller1;

//clase abstracta para crear los manejadores
abstract class HandlerBase {
    protected HandlerBase nextHandler;

    public void handlerRequest(String user, String role) {
        if (nextHandler != null) {
            nextHandler.handlerRequest(user, role);
        }
    }

    public void setNextHandler(HandlerBase nextHandler) {
        this.nextHandler = nextHandler;
    }
}

// clases concretas de los manejadores

// verifica autorizacion
class AuthorizationHandler extends HandlerBase {
    @Override
    public void handlerRequest(String user, String role) {
        if (user == null || user.isEmpty()) {
            System.out.println("user is not authenticated");
        } else {
            System.out.println("user is authenticated");
            super.handlerRequest(user, role);
        }
    }
}

// verifica rol
class RolValidationHandler extends HandlerBase {
    @Override
    public void handlerRequest(String user, String role) {
        if (role.equals("USER")) {
            System.out.println("user authenticated as regular user");
        } else {
            super.handlerRequest(user, role);
        }
    }
}

// verifica admin
class AdminValidationHandler extends HandlerBase {
    @Override
    public void handlerRequest(String user, String role) {
        if (role.equals("ADMIN")) {
            System.out.println("user authenticated as Admin ");
        } else {
            System.out.println("user is not authenticated");
        }
    }
}

public class Main {

    private static HandlerBase getChain() {

        //se crean los diferentes manejadores concretos
        HandlerBase authHandler = new AuthorizationHandler();
        HandlerBase rolHandler = new RolValidationHandler();
        HandlerBase adminHanlder = new AdminValidationHandler();

        //se usa el metodo setNextHandler para organizar la cadena de pasos 
        authHandler.setNextHandler(rolHandler);
        rolHandler.setNextHandler(adminHanlder);

        return authHandler;
    }

    public static void main(String[] args) {
        HandlerBase chain = getChain();
        chain.handlerRequest("pepe", "USER");
        chain.handlerRequest("manuela", "ADMIN");
    }
}
