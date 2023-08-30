import java.util.Random;
import java.util.Scanner;

public class extra5 {
    //Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
    
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de la matriz");
        int fila=read.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas=read.nextInt();
        read.close();
        int[][] matrix= new int[fila][columnas];
        Randomizar(matrix,fila,columnas);
        int sumaTotal = sumar(matrix, fila, columnas);
    
        System.out.println("La suma de los elementos de la matriz es: " + sumaTotal);
    }
    public static void Randomizar(int[][] matrix,int fila,int columnas ){
        Random random=new Random();
        for (int i=0;i<fila;i++){
            for (int j = 0 ;j<columnas;j++) {
                matrix[i][j]=random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
        }
    }
}public static int sumar(int[][]matrix, int fila, int columnas){
    int sumaTotal=0;
    for (int i=0;i<fila;i++){
            for (int j = 0 ;j<columnas;j++) {
                sumaTotal += matrix[i][j];
}
    }
return sumaTotal;
}
}
