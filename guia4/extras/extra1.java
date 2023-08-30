package guia4.extras;

import java.util.Scanner;

public class extra1 {
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
    System.out.println("Ingrese el tamaño del vector");
    int tamano= read.nextInt();
    int [] vector=new int[tamano];
    for(int i =0; i<=tamano-1;i++){
        System.out.print("Ingrese el valor para la posición " + i + ": ");
        vector[i] = read.nextInt();
    }
int suma=0;
for(int i=0; i<=tamano-1;i++){
    suma+=vector[i];
}
System.out.println("La suma de los elementos del vector son: "+suma);
 }
}
