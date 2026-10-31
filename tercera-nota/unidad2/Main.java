class Cuenta {

    double saldo;
}

public class Main {

    public static void actualizarCuenta(Cuenta cuenta) {

        cuenta.saldo = cuenta.saldo + 500;

        cuenta = new Cuenta();

        cuenta.saldo = 1000;
    }

    public static void main(String[] args) {

        Cuenta c = new Cuenta();

        c.saldo = 2000;

        actualizarCuenta(c);

        System.out.println("Saldo original: " + c.saldo);
    }
}
