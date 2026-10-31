class Estudiante {

    String nombre;
}

public class Main {

    public static void cambiarEstudiante(Estudiante estudiante) {

        estudiante = new Estudiante();

        estudiante.nombre = "Juan";
    }

    public static void main(String[] args) {

        Estudiante e = new Estudiante();

        e.nombre = "Pedro";

        cambiarEstudiante(e);

        System.out.println("Estudiante: " + e.nombre);
    }
}
