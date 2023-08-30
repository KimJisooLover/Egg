package guia4;

public class ej1 {
    public static void main(String[] args) {
           int[] vector= new int[100];
    for (int i =0; i<100;i++){
       vector[i]=i+1;
    }
    //Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla 
    //en orden descendente.
        System.out.println("Los primeros 100 números enteros en orden descendente:");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }

    }

}
