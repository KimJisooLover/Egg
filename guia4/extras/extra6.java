package guia4.extras;
import java.util.Random;
import java.util.Scanner;

public class extra6 {
    /*construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
    construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en
     una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no 
     utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada*/
public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    char[][] sopa = new char[20][20];
    Random random = new Random();
    // Inicializar la sopa con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
        sopa[i][j] = (char) (random.nextInt(10) + '0');
    }
    }
    String[] palabras=new String[5];
    int wordsEntered=0;
    while (wordsEntered < 5) {
        System.out.println("Ingrese una palabra de entre 3 y 5 letras");
        String Respuesta = read.nextLine();
        
        if (Respuesta.length() > 5 || Respuesta.length() < 3) {
            System.out.println("Cantidad de letras inválida");
        } else {
            palabras[wordsEntered]=Respuesta.toUpperCase();
            wordsEntered++;
        }
    }
    for(String palabra:palabras){
        Sopa(palabra,sopa);
    }
    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            System.out.print(sopa[i][j] + " ");
        }
        System.out.println();
    }
  read.close();

}
public static void Sopa(String palabra,char [][]sopa){
    Random random = new Random();
    int filaAleatoria = random.nextInt(20);
    int longitudPalabra = palabra.length();
    int columnaInicial = random.nextInt(20 - longitudPalabra + 1); // Columna inicial aleatoria


for(int i = 0; i<longitudPalabra;i++){
    sopa[filaAleatoria][columnaInicial+i]=palabra.charAt(i);{}

}
for (int i = 0; i < 20; i++) {
    for (int j = 0; j < 20; j++) {
        if (sopa[i][j] >= '0' && sopa[i][j] <= '9') {
            char letraAleatoria = (char) (random.nextInt(26) + 'A'); // Generar letra aleatoria en mayúscula
            sopa[i][j] = letraAleatoria;
}
}

}
}
}

