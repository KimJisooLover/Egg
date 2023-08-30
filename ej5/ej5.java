package ej5;

import java.util.Scanner;

public class ej5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();
        
        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        
        System.out.println("El doble del número es: " + doble);
        System.out.println("El triple del número es: " + triple);
        System.out.println("La raíz cuadrada del número es: " + raizCuadrada);
        
    }

  
}
