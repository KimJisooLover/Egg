package practicasVectoresMatrix;

import java.util.Random;
import java.util.Scanner;

public class ej2 {
    // Buscar número en un vector aleatorio y mostrar su posición y repetición.
//Crear un programa que llene un vector de tamaño N con valores aleatorios.
//Pedir al usuario un número para buscar en el vector.
//El programa debe mostrar la posición donde se encuentra el número y si está repetido.

public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Random random = new Random();
System.out.println("Ingrese el tamño del vector");
int tamano=leer.nextInt();
int[]vector=new int[tamano];
for (int i=0;i<tamano;i++ ){
    vector[i]=random.nextInt(100)+1;
}
System.out.println("Ingrese el numero a buscar");
int buscar=leer.nextInt();
leer.close();
boolean encontrado= false;
int contador = 0;
// Buscar el número en el vector y contar cuántas veces aparece
for (int i = 0; i < tamano; i++) {
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



