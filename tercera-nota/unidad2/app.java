public class Main {

    public static void cambiarNumero(int num) {
        num = num * 2;
        System.out.println("Dentro del metodo: " + num);
    }

    public static void main(String[] args) {

        int num = 10;

        System.out.println("Antes: " + num);

        cambiarNumero(num);

        System.out.println("Despues: " + num);
    }
}