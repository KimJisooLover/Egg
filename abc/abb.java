package abc;
import java.util.Scanner;


 /**
 *
 * @author 04aro
 */
public class abb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese una frase: ");
        String frase = scanner.nextLine();
        
        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        
        System.out.println("Frase en mayúsculas: " + mayusculas);
        System.out.println("Frase en minúsculas: " + minusculas);
        
        scanner.close();
    }
}
