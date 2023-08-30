package guia4;
import java.util.Scanner;
public class ej6 {
    //Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus 
    //diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es
    // mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int[][] square = new int[3][3]; // Crear un cuadrado 3x3
    
            System.out.println("Introduzca los números para el cuadrado mágico (del 1 al 9):");
    
            // Leer los números para el cuadrado mágico
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int number = scanner.nextInt();
                    // Verificar que el número esté en el rango permitido
                    if (number < 1 || number > 9) {
                        System.out.println("Número fuera del rango permitido (1-9). Inténtelo de nuevo.");
                        j--; // Repetir la entrada del mismo número
                    } else {
                        square[i][j] = number;
                    }
                }
            }
    
            // Calcular la suma objetivo (la suma de cualquier fila, columna o diagonal)
            int targetSum = square[0][0] + square[0][1] + square[0][2];
    
            // Verificar filas, columnas y diagonales
            boolean isMagic = true;
            for (int i = 0; i < 3; i++) {
                int rowSum = 0;
                int colSum = 0;
    
                for (int j = 0; j < 3; j++) {
                    rowSum += square[i][j];
                    colSum += square[j][i];
                }
    
                if (rowSum != targetSum || colSum != targetSum) {
                    isMagic = false;
                    break;
                }
            }
    
            // Verificar diagonales
            int mainDiagonalSum = square[0][0] + square[1][1] + square[2][2];
            int antiDiagonalSum = square[0][2] + square[1][1] + square[2][0];
    
            if (!isMagic || mainDiagonalSum != targetSum || antiDiagonalSum != targetSum) {
                System.out.println("El cuadrado no es mágico.");
            } else {
                System.out.println("¡Felicidades! El cuadrado es mágico.");
            }
        }
    }
    


