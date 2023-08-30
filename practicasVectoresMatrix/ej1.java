package practicasVectoresMatrix;

import java.util.Scanner;

public class ej1 {
    // Llenar un vector con los primeros N números enteros y mostrarlos en orden descendente.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int vector = leer.nextInt();
        System.out.println();
        leer.close();
        Llenar(vector); // Llamar a la función Llenar con el tamaño del vector
    }

    public static void Llenar(int vector) {
        for (int i = vector - 1; i >= 0; i--) {
            System.out.println(i); // Mostrar el número actual en orden descendente
        }
    }
}
