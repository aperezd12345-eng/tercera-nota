import java.util.Scanner;

public class edades {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        byte[] edades = new byte[5];

        // Leer las 5 posiciones
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = leer.nextByte();
        }

        // Mostrar el arreglo
        System.out.println("\nEdades ingresadas:");

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Posición " + i + ": " + edades[i]);
        }

        leer.close();
    }
}

