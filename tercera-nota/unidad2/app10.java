class Producto {

    String nombre;
    double precio;
}

public class Main {

    public static void modificarProductos(Producto[] productos) {

        productos[1].precio = 5000;
    }

    public static void main(String[] args) {

        Producto[] lista = new Producto[3];

        lista[0] = new Producto();
        lista[0].nombre = "Arroz";
        lista[0].precio = 2000;

        lista[1] = new Producto();
        lista[1].nombre = "Leche";
        lista[1].precio = 3000;

        lista[2] = new Producto();
        lista[2].nombre = "Pan";
        lista[2].precio = 1500;

        modificarProductos(lista);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(
                lista[i].nombre + ": " + lista[i].precio
            );
        }
    }
}
