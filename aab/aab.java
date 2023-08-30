package aab;

import java.util.Scanner;
 /**
 *
 * @author 04aro
 */
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
//La fórmula correspondiente es: F = 32 + (9 * C / 5).
public class aab {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
    System.out.println("Ingrese la cantidad de grados Centigrados");
Scanner leer =new Scanner(System.in);
    double celsius = leer.nextDouble();
        
    double fahrenheit = 32 + (9 * celsius / 5);
    
    System.out.println("La temperatura equivalente en grados Fahrenheit es: " + fahrenheit);
    
    
}
}