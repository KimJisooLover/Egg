package guia3;

import java.util.Scanner;

public class ej4 {
//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique
// si es o no un número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo:
// 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
public static void main(String[] args) {
 System.out.println("Ingrese el numero");
Scanner leer = new Scanner (System.in);
int num=leer.nextInt();
esPrimo(num);
}
public static void esPrimo(int num){
    boolean esPrimo = true; // Suponemos inicialmente que el número es primo
    
    if (num <= 1) {
        esPrimo = false; // Los números menores o iguales a 1 no son primos
    } else {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                esPrimo = false; // Si es divisible por algún número distinto de 1 y sí mismo, no es primo
                break; // Salimos del bucle, ya que no es necesario seguir verificando
            }
        }
    }
    
    if (esPrimo) {
        System.out.println("El número es primo");
    } else {
        System.out.println("El número no es primo");
    }
}
}
