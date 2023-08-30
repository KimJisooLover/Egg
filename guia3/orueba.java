package guia3;

import java.util.Scanner;

public class orueba {
    public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros= Double.parseDouble(leer.nextLine());
        System.out.println("Igrese la moneda en que quiere convertir el cambion (Yen/Libra/dolar)");
        String moneda = leer.nextLine();
        ConversorMoneda(euros, moneda);
    }
    public static void ConversorMoneda (double euros, String moneda){
        double conversion = 0.0;
        String monedaNombre = "";
        if (moneda.equalsIgnoreCase("Libra")) {
            conversion = euros * 0.86;
            monedaNombre = "libras";
        } else if (moneda.equalsIgnoreCase("Dólar")) {
            conversion = euros * 1.28611;
            monedaNombre = "dólares";
        } else if (moneda.equalsIgnoreCase("Yen")) {
            conversion = euros * 129.852;
            monedaNombre = "yenes";
        } else {
            System.out.println("Moneda no válida. Por favor, ingrese 'libra', 'dólar' o 'yen'.");
            return;
        }
        // Muestra el resultado de la conversión
        System.out.println(euros + " euros equivalen a " + conversion + " " + monedaNombre);
}
}