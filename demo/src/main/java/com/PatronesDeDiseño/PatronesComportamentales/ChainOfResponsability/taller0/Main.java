package com.PatronesDeDiseño.PatronesComportamentales.ChainOfResponsability.taller0;

abstract class HandlerBase{
    protected HandlerBase handlerBase;

    public void handlerRequest(int level, String message){
        if(handlerBase != null){
            handlerBase.handlerRequest(level, message);
        }
    }
}

//verifica si es de nivel 1
class Level1Handler extends HandlerBase{
    
}

class Logger {

    public void logMessage(int level, String message) {
        if (level == 1) {
            System.out.println("info: " + message);
        }

        if (level == 2) {
            System.out.println("info: " + message);
        }

        if (level == 3) {
            System.out.println("info: " + message);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();
        logger.logMessage(1, "mondongo");
        logger.logMessage(2, "hola");
        logger.logMessage(1, "adios");
    }
}
