package guia4;

import java.util.Scanner;

public class ej5 {
    //Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica 
    //cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
    //La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int rows = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols]; // Crear la matriz

        System.out.println("Ingrese los elementos de la matriz:");

        // Leer la matriz ingresada por el usuario
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isAntisymmetric = checkAntisymmetric(matrix);

        if (isAntisymmetric) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

    public static boolean checkAntisymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false; // Una matriz no cuadrada no puede ser antisimétrica
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != -matrix[j][i]) { // Verificar la propiedad de antisimetría
                    return false;
                }
            }
        }

        return true;
    }
}
