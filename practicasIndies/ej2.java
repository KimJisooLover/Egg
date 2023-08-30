package practicasIndies;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        //Crea un programa que solicite un número al usuario e imprima la tabla de multiplicar de ese número del 1 al 10.
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero deseado");
        int num=leer.nextInt();
    Tablas(num);
    }
    public static void Tablas(int num){
        for (int i = 1 ;i<=10;++i){
          System.out.print ("El resultado de "+num+ " Por "+ i+ " es " +(num*i));
          System.out.println();
    }
}
}
