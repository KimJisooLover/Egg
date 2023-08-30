package practicasIndies;

import java.util.Scanner;

public class ej8 {
    //Pide al usuario que ingrese una base y un exponente, luego muestra la tabla de potencias de esa base desde 0 hasta 
    //el exponente.
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese una base");
    double base=leer.nextInt();
    System.out.println("Ingrese un exponente");
    double exponente= leer.nextInt();
    Potencias(base,exponente);
    }

    public static void Potencias(double base,double exponente){
        for (int i=0;i<=exponente;i++ ){
            double resultado= Math.pow(base, i);
        System.out.println(resultado);
        }
    }
}
