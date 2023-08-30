import java.util.Scanner;

public class extra4 {
    public static void main(String[] args) {
        //Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos 
        //para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 
        //2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener
// por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
//igual al 7 de sus notas del curso.
Scanner read=new Scanner(System.in);
int cantidadAlumnos = 10;
double[] promedios = new double[cantidadAlumnos];
int aprobados = 0;
int desaprobados = 0;
for (int i=0;i<cantidadAlumnos;i++){
   
    System.out.println("Ingrese las notas del "+(i+1)+ " lumno:");
    System.out.println("Primer Tp:");
    double tp=read.nextDouble();
    System.out.println("Segundo Tp:");
    double tp2=read.nextDouble();
    System.out.println("Primer integrador:");
    double Primero= read.nextDouble();
    System.out.println("Segundo integrador:");
    double Segundo=read.nextDouble();
   
    double promedio=(tp*0.10)+(tp2*0.15)+(Primero * 0.25)+(Segundo*0.50);
    promedios[i] = promedio;
    if ((promedio>=7)){
        aprobados++;
}else{
    desaprobados++;
}
}
System.out.println("Los alumnos aprobados son "+ aprobados);
System.out.println("Los alumnos desaprobados son "+desaprobados);
read.close();
    
}

}
