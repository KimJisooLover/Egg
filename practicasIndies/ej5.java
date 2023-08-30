package practicasIndies;
public class ej5 {
//Secuencia de Fibonacci: Imprime los primeros 10 números en la secuencia de Fibonacci 
//(cada número es la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, ...).
    public static void main(String[] args) throws Exception{
        int n=10;
        Fibonacci(n);
}
public static void Fibonacci(int n){
    int primero = 0;
    int segundo = 1;

    System.out.print("Secuencia de Fibonacci (" + n + " términos): ");
    for (int i = 1; i <= n; i++) {
        System.out.print(primero + " ");
        int siguiente = primero + segundo;
        primero = segundo;
        segundo = siguiente;
    }
    
}
}

