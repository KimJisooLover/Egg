package practicasVectoresMatrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class ej3 {
    //Crear un programa que llene un vector de N enteros aleatorios.
//Luego, recorrer el vector y contabilizar cuántos números son de 1 dígito, cuántos de 2 dígitos, etc. (hasta 5 dígitos).
//Mostrar los resultados de la contabilización.
public static void main(String[] args) {
    Random random = new Random();
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del vector");
    int tamano= leer.nextInt();
    leer.close();
    int []vector=new int[tamano];
    for (int i=0;i<tamano;i++ ){
        vector[i]=random.nextInt(99999)+1;
}
System.out.println(Arrays.toString(vector));
int[] digitCounts = new int[5]; // Un arreglo para las cantidades de dígitos 1-5
for (int number : vector) {
    int digits = countDigits(number);
    if (digits >= 1 && digits <= 5) {
        digitCounts[digits - 1]++; // Restar 1 para ajustar el índice
    }
}

for (int i = 0; i < 5; i++) {
    System.out.println("Números con " + (i + 1) + " dígito(s): " + digitCounts[i]);
}
}

public static int countDigits(int number) {
if (number == 0) {
    return 1;
}
int count = 0;
while (number != 0) {
    count++;
    number /= 10;
}
return count;
}
}
