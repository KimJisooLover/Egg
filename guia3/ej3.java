public class ej3 {
//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
// estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
//que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicita al usuario ingresar la cantidad de euros
        System.out.print("Ingrese la cantidad de euros: ");
        double euros = Double.parseDouble(leer.nextLine());

        // Solicita al usuario la moneda a la que desea convertir
        System.out.print("Ingrese la moneda a la que desea convertir (libras/dólares/yenes): ");
        String monedaDestino = leer.nextLine();

        // Llama a la función convertirMoneda con la cantidad de euros y la moneda destino
        convertirMoneda(euros, monedaDestino);
    }

    // Función para convertir una cantidad de euros a la moneda destino
    public static void convertirMoneda(double euros, String monedaDestino) {
        double conversion = 0.0;
        String monedaNombre = "";

        // Realiza la conversión basada en la moneda destino ingresada
        if (monedaDestino.equalsIgnoreCase("libras")) {
            conversion = euros * 0.86;
            monedaNombre = "libras";
        } else if (monedaDestino.equalsIgnoreCase("dólares")) {
            conversion = euros * 1.28611;
            monedaNombre = "dólares";
        } else if (monedaDestino.equalsIgnoreCase("yenes")) {
            conversion = euros * 129.852;
            monedaNombre = "yenes";
        } else {
            // Si la moneda destino no es válida, muestra un mensaje de error y sale de la función
            System.out.println("Moneda no válida. Por favor, ingrese 'libras', 'dólares' o 'yenes'.");
            return;
        }

        // Muestra el resultado de la conversión
        System.out.println(euros + " euros equivalen a " + conversion + " " + monedaNombre);
    }
}
