package guia3;

import java.util.Scanner;


public class ej1 {
    public static void main(String[] args){
    //Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
    // La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos 
    //en el main. 

Scanner leer= new Scanner(System.in);
System.out.println("Ingrese el primer numero");
int num1 = leer.nextInt();
System.out.println("Ingrese el segundo numero"); 
int num2 = leer.nextInt();
leer.nextLine();
System.out.println("Seleccione la opcion que usted desea: ");
System.out.println("Caso a: Sumar");
System.out.println("Caso b: Restar");
System.out.println("Caso c: Multiplicar");
System.out.println("Caso d: Dividir");
String resp= leer.nextLine();
switch (resp){
    case "a": 
    System.out.println(Suma(num1, num2));
    break;
    case "b":
    System.out.println(Resta(num1, num2));
    break;
    case "c":
    System.out.println(mult(num1, num2));
    break;
    case "d":
    System.out.println(div(num1, num2));
    break;
    default:
    System.out.println("Opción no válida");

    
}
}
public static int Suma(int num1, int num2){
    int resultadox= num1 + num2;
    return resultadox;
}
public static int Resta(int num1, int num2){
    int resultadox= num1 - num2;
    return resultadox;
}
public static int mult(int num1, int num2){
    int resultadox= num1 * num2;
    return resultadox;
}
public static int div(int num1, int num2){
    int resultadox= num1 / num2;
    return resultadox;
}
}