public class Main {

    public static void incrementar(int numero) {
        numero = numero + 5;
        System.out.println("Dentro: " + numero);
    }

    public static void main(String[] args) {

        int edad = 20;

        System.out.println("Antes: " + edad);

        incrementar(edad);

        System.out.println("Despues: " + edad);
    }
}