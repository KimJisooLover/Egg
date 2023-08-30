package practicasIndies;


    import java.util.Scanner;

public class asdas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int suma = calcularSuma(numero);
            System.out.println("La suma de los números enteros desde 1 hasta " + numero + " es: " + suma);
        }
    }

    public static int calcularSuma(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}


