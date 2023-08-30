package guia4.extras;
import java.util.Scanner;
public class extra2 {
    //Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    //(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
    public static void main (String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector 1");
        int tamanoVectorUno =read.nextInt();
        System.out.println("Ingrese el tamaño del vector 2");
        int tamanoVectorDos =read.nextInt();

        if (tamanoVectorDos!=tamanoVectorUno){
        System.out.println("Los vectores son distintos");
        }else {
            boolean sonIguales = true;
            int[] vectorUno = new int[tamanoVectorUno];
            int[] vectorDos = new int[tamanoVectorDos];
            
            for (int i=0;i<tamanoVectorUno;i++){
                System.out.println("Ingrese elemento "+ i +" del Vector Uno: ");
                vectorUno[i] = read.nextInt();
            }
            
            for(int i=0;i<tamanoVectorDos;i++){
                System.out.println ("Ingrese elemento " + i + " del Vecto Dos : ");
                vectorDos[i] = read.nextInt();
            }
        
  for (int i = 0; i < tamanoVectorUno; i++) {
                if (vectorUno[i] != vectorDos[i]) {
                    sonIguales = false;
                    break;
                }
            }

            if (sonIguales) {
                System.out.println("Los vectores son iguales.");
            } else {
                System.out.println("Los vectores son distintos.");
            }
        }
    }
}