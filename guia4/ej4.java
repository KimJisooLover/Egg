package guia4;

import java.util.Random;

public class ej4 {
    //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
    //La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

    public static void main(String[] args) {
        int[][] matrix = new int[4][4]; // Crear una matriz 4x4

        // Llenar la matriz con valores aleatorios
        fillRandomMatrix(matrix);

        System.out.println("Matriz original:");
        printMatrix(matrix);

        int[][] transposedMatrix = transposeMatrix(matrix); // Calcular la matriz traspuesta

        System.out.println("\nMatriz traspuesta:");
        printMatrix(transposedMatrix);
    }

    public static void fillRandomMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(100); // Valores aleatorios entre 0 y 99
            }
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows]; // Crear la matriz traspuesta

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j]; // Intercambiar filas por columnas
            }
        }

        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t"); // Imprimir cada elemento de la matriz
            }
            System.out.println(); // Cambiar de línea al final de cada fila
        }
    }
}
