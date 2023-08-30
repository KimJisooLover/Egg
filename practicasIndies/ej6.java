package practicasIndies;

public class ej6 {
    //Números Pares e Impares:
//Escribe un programa que muestre los números pares del 2 al 20 y luego los números impares del 1 al 19.
    
    public static void main(String[] args) {
    int i=0;
System.out.println("Los pares son: ");
Pares220(2,20);
System.out.println("Los impares son: ");
Impares119(1,19);
    }
    public static void Pares220(int inicio, int fin){
for (int i=inicio; i<=fin; i++){
    if (i%2==0 ){
        System.out.println(i); 
    } 

       
    }
}
        public static void Impares119(int inicio, int fin){
for (int i=1; i<=19; i++){
    if (i%2!=0 ){
        System.out.println(i); 
    } 

       
    }
    }
}
