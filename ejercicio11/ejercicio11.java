package ejercicio11;
import java.util.Scanner;

public class ejercicio11 {// Declaración de la clase principal
    public static void main(String[] args) { // Método principal (punto de entrada del programa)
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer entrada

        System.out.println("Ingrese una secuencia de caracteres (terminada en punto): ");
        // Imprimir un mensaje para solicitar entrada al usuario
        String entrada = scanner.nextLine(); // Leer la línea de entrada del usuario
        String codificacion = codificar(entrada); // Llamar al método codificar con la entrada y obtener la codificación

        System.out.println("Resultado de la codificación: " + codificacion);
        // Imprimir el resultado de la codificación

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }

    public static String codificar(String entrada) { // Definición del método para codificar
        StringBuilder resultado = new StringBuilder(); // Crear un StringBuilder para almacenar el resultado
        char[] caracteres = entrada.toCharArray(); // Convertir la entrada en un arreglo de caracteres

        for (char c : caracteres) { // Iterar a través de cada carácter en el arreglo
            switch (c) { // Estructura switch para realizar la codificación basada en el carácter
                case 'a':
                    resultado.append('@'); // Agregar '@' al StringBuilder
                    break;
                case 'e':
                    resultado.append('#'); // Agregar '#' al StringBuilder
                    break;
                case 'i':
                    resultado.append('$'); // Agregar '$' al StringBuilder
                    break;
                case 'o':
                    resultado.append('%'); // Agregar '%' al StringBuilder
                    break;
                case 'u':
                    resultado.append('*'); // Agregar '*' al StringBuilder
                    break;
                case 'á':
                    resultado.append('@'); // Agregar '@' al StringBuilder
                    break;
                case 'é':
                    resultado.append('#'); // Agregar '#' al StringBuilder
                    break;
                case 'í':
                    resultado.append('$'); // Agregar '$' al StringBuilder
                    break;
                case 'ó':
                    resultado.append('%'); // Agregar '%' al StringBuilder
                    break;
                case 'ú':
                    resultado.append('*'); // Agregar '*' al StringBuilder
                    break;
                default:
                    resultado.append(c); // Si no es una vocal especial, agregar el carácter tal cual
            }
        }

        return resultado.toString(); // Devolver el resultado del StringBuilder como una cadena
    }
}
