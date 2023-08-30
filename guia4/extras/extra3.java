import java.util.Random;
import java.util.Scanner;

public class extra3 {
    //Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
    //Después haremos otra función o procedimiento que imprima el vector.
public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del vector");
    int vector=read.nextInt();
    System.out.println();
    int [] numeros = new int[vector];
    Random random=new Random();
    LllenarAleatorio(numeros, vector);
    imprimirVector(numeros);
    read.close();

}
public static void LllenarAleatorio(int[] numeros,int vector){
    Random random=new Random();

    for (int i = 0; i <vector;i++){
        numeros[i]=random.nextInt(100);
        
    }
    
}
public static void imprimirVector(int []numeros){
for (int i=0; i < numeros.length;i++){
    System.out.println(numeros[i]+"");
    
}
}
}
