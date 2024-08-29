package com.example.Otros;

public class residuos  {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 

         // Imprimimos los números originales
         System.out.println("Números originales:");
         for (int i = 0; i < numeros.length; i++) {
             System.out.print(numeros[i] + " ");
         }
         
         // Ciclo que divide cada número por 5
         System.out.println("\n\nNúmeros después de dividir por 5:");
         for (int i = 0; i < numeros.length; i++) {
             numeros[i] = numeros[i] % 5; // Dividimos el número por 5
             System.out.print(numeros[i] + " "); // Imprimimos el resultado
         }
    }    
}
