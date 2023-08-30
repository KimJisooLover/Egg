package practicasIndies;

import java.util.Scanner;



public class ej3 {
    public static void main(String[] args) {
        //Pide al usuario que ingrese un número entero positivo y luego calcula la suma de todos los números enteros positivos
        //desde 1 hasta el número ingresado.
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingresa el numero entero positivo");
        int numero=leer.nextInt();
        
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        } else { 
            int suma = calcularSuma(numero);
            System.out.println("La suma de los números enteros desde 1 hasta " + numero + " es: " + suma);
    }
}
    public static int calcularSuma(int numero){
        int suma=0;
        for (int i =1 ;i<=numero;i++){
        suma+=i;
}
return suma;
}
}
