package guia4;
import java.util.Random;
import java.util.Scanner;

public class ej2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Ingrese el tamaño del vector");
    int n =scanner.nextInt();
    int[]vector=new int[n];
    for (int i=0;i<n;i++ ){
        vector[i]=random.nextInt(100)+1;

    }
System.out.println("Ingrese el numero a buscar");
int buscar=scanner.nextInt();
scanner.close();
boolean encontrado= false;
int contador = 0;

        // Buscar el número en el vector y contar cuántas veces aparece
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                encontrado = true;
                contador++;
                System.out.println("El número " + buscar + " se encuentra en la posición " + i);
            }
        }

        if (!encontrado) {
            System.out.println("El número " + buscar + " no se encuentra en el vector.");
        } else {
            if (contador > 1) {
                System.out.println("El número " + buscar + " se encuentra repetido " + contador + " veces.");
            } else {
                System.out.println("El número " + buscar + " se encuentra una vez en el vector.");
            }
        }
    }
}


