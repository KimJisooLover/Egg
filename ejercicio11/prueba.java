package ejercicio11;

import java.util.Scanner;

public class prueba {
 public static void main(String[] args) {
   //Invoco al primer array
   int result= suma(10, 10);
   System.out.println(result);
   //Creo un scanner para usar luego
   Scanner leer = new Scanner(System.in);
 //Invoco con distintas variables al array
 SaludoPersonalidado("Javier");
 String nombre= leer.next();
 SaludoPersonalidado(nombre);
 SaludoPersonalidado(leer.next());
 }
 
public static int suma(int a, int b){
//logica
int resultado= a+ b;

    return resultado;

}
public static void SaludoPersonalidado(String nombre){
System.out.println("Hola "+ nombre+ " Un gusto");




}
}
