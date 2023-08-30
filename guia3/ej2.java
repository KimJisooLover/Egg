package practicasIndies;

import java.util.Scanner;

public class ej2 {
    //Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado 
    // e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere 
    //seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String input;
        do{
        System.out.println("Ingrese el nombre de la persona");
        String nombre= leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int edad=Integer.parseInt(leer.nextLine());
if (edad>=18){
    System.out.printf(nombre+"tiene " +edad+ " años");

}else{
    System.out.println(nombre+"tiene " + edad+" no es mayor de edad");
}


System.out.print("¿Desea ingresar otra persona? (Sí/No): ");
input = leer.nextLine();
    }
while (!input.equalsIgnoreCase("No"));
System.out.println("¡Programa finalizado!");
    }
    }

