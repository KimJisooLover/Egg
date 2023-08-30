package guia4;

public class ej3 {
    //Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).?
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 345, 6789, 12345, 67, 8, 9, 123 };

        int[] digitCounts = new int[6]; // Índices del 0 al 5 representan números de 0 a 5 dígitos

        for (int number : numbers) {
            int numDigits = countDigits(number);
            if (numDigits > 5) {
                numDigits = 5; // Limitamos a 5 dígitos
            }
            digitCounts[numDigits]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números con " + i + " dígitos: " + digitCounts[i]);
        }
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1; // El número 0 tiene 1 dígito
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
