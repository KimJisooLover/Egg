package guia4;

public class guia4 {

    public static void main(String[] args) {
              // Definir el vector
        int[] vector = {3, 5};

        // Definir la matriz
        int[][] matriz = {
            {4, 8, 6},
            {2, 1, 7}
        };

        // Verificar si las dimensiones son compatibles para la multiplicación
        if (vector.length != matriz.length) {
            System.out.println("Las dimensiones no son compatibles para la multiplicación.");
            return;
        }

        // Calcular el producto matriz-vector
        int[] resultado = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < vector.length; i++) {
                resultado[j] += vector[i] * matriz[i][j];
            }
        }

        // Imprimir el resultado
        System.out.print("Resultado: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}