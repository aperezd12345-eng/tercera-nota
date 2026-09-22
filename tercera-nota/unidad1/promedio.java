import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int[] numeros = new int[4];
    int suma = 0;
    
    for(int i=0; i < numeros.length; i++) {
        System.out.print("ingrese el numero "+ (i+1)+ ":");
        numeros[i]= leer.nextInt();
        suma += numeros[i];

    }
    System.out.println("El promedio es: " + ( suma /numeros.length));
    
}
}
