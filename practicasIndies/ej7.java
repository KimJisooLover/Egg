package practicasIndies;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        // Llamamos a la función contarDigitos y almacenamos el resultado en cantidadDigitos
        int cantidadDigitos = contarDigitos(numero);

        // Imprimimos el resultado
        System.out.println("El número "+numero+ " tiene " + cantidadDigitos + " dígito/s.");
    }

    public static int contarDigitos(int numero) {
        // Si el número es negativo, tomamos el valor absoluto para contar los dígitos
        numero = Math.abs(numero);

        // Si el número es 0, tiene un solo dígito
        if (numero == 0) {
            return 1;
        }

        int contador = 0;

        // Usamos un bucle while para dividir el número entre 10 y contar los dígitos
        while (numero > 0) {
            numero /= 10; // Dividimos el número entre 10 para eliminar el último dígito
            contador++;   // Incrementamos el contador de dígitos
        }

        // Devolvemos el número de dígitos como resultado
        return contador;
    }
}