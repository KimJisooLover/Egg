import java.util.Random;
import java.util.Scanner;

public class pruebas{
    public static void main(String[] args) {
        System.out.println("Pruebitaaa");
        Scanner read = new Scanner(System.in);
        char[][] sopa = new char[20][20];
        Random random = new Random();

        // Inicializar la sopa con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = (char) (random.nextInt(10) + '0');
            }
        }

        String[] palabras = new String[5];
        int wordsEntered = 0;

        while (wordsEntered < 5) {
            System.out.println("Ingrese una palabra de entre 3 y 5 letras");
            String respuesta = read.nextLine();

            if (respuesta.length() > 5 || respuesta.length() < 3) {
                System.out.println("Cantidad de letras inválida");
            } else {
                palabras[wordsEntered] = respuesta;
                wordsEntered++;
            }
        }

        for (String palabra : palabras) {
            Sopa(palabra, sopa);
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }

        read.close();
    }
public static void Sopa(String palabra, char[][] sopa) {
        Random random = new Random();
        int filaAleatoria = random.nextInt(20);
        int longitudPalabra = palabra.length();
        int columnaInicial = random.nextInt(20 - longitudPalabra + 1); // Columna inicial aleatoria

        for (int i = 0; i < longitudPalabra; i++) {
            sopa[filaAleatoria][columnaInicial + i] = palabra.charAt(i);
        }
    }
}