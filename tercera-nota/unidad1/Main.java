import java.util.Scanner;

// Clase base para heroes y villanos
class Personaje {
    protected String nombre;
    protected int fuerza;
    protected int velocidad;
    protected int vidaHp;
    private boolean defendiendo;

    // Constructor del personaje
    public Personaje(String nombre, int fuerza, int velocidad, int vidaHp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vidaHp = vidaHp;
        this.defendiendo = false;
    }

    // Ataque normal
    public void atacar(Personaje oponente) {
        System.out.println(nombre + " ataca a " + oponente.nombre);
        oponente.recibirDanio(fuerza);
    }

    // Sobrecarga del ataque: aumenta el daño
    public void atacar(Personaje oponente, int bonificacion) {
        int danio = fuerza + bonificacion;
        System.out.println(nombre + " realiza un ataque aumentado.");
        oponente.recibirDanio(danio);
    }

    // Activa la defensa
    public void defender() {
        defendiendo = true;
        System.out.println(nombre + " se prepara para defenderse.");
    }

    // Calcula y aplica el daño recibido
    public void recibirDanio(int danio) {
        if (defendiendo) {
            danio = (int) Math.ceil(danio * 0.5);
            defendiendo = false;
        }

        vidaHp = Math.max(0, vidaHp - danio);
        System.out.println(nombre + " pierde " + danio + " puntos de vida.");
    }

    // Recupera puntos de vida
    public void recuperarse(int cantidad) {
        vidaHp += cantidad;
        System.out.println(nombre + " recupera " + cantidad + " puntos de vida.");
    }

    // Muestra los atributos actuales
    public void mostrarEstadisticas() {
        System.out.println("\n--- ESTADISTICAS DE " + nombre + " ---");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Vida: " + vidaHp);
    }

    // Comprueba si el personaje sigue vivo
    public boolean estaVivo() {
        return vidaHp > 0;
    }
}

// Clase del superheroe
class SuperHero extends Personaje {

    public SuperHero(String nombre, int fuerza, int velocidad, int vidaHp) {
        super(nombre, fuerza, velocidad, vidaHp);
    }

    // Ataque especial que duplica la fuerza
    public void ataqueEspecial(Personaje oponente) {
        int danio = fuerza * 2;
        System.out.println(nombre + " utiliza su ATAQUE ESPECIAL.");
        oponente.recibirDanio(danio);
    }
}

// Clase del villano
class Villano extends Personaje {

    public Villano(String nombre, int fuerza, int velocidad, int vidaHp) {
        super(nombre, fuerza, velocidad, vidaHp);
    }

    // Trampa que duplica el ataque
    public void hacerTrampa(Personaje oponente) {
        int danio = fuerza * 2;
        System.out.println(nombre + " hace trampa y duplica su ataque.");
        oponente.recibirDanio(danio);
    }
}

// Clase principal del juego
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Creamos al superheroe y al villano
        SuperHero heroe = new SuperHero("Titan", 25, 40, 200);
        Villano villano = new Villano("Sombra", 20, 30, 180);

        int opcion;

        // El menu se repite mientras continue el combate
        do {
            System.out.println("\n===== JUEGO DE SUPERHEROES =====");
            System.out.println("1. Atacar");
            System.out.println("2. Defenderse");
            System.out.println("3. Ataque especial");
            System.out.println("4. Recuperarse");
            System.out.println("5. Mostrar estadisticas");
            System.out.println("6. Ataque aumentado");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    heroe.atacar(villano);
                    break;

                case 2:
                    heroe.defender();
                    break;

                case 3:
                    heroe.ataqueEspecial(villano);
                    break;

                case 4:
                    heroe.recuperarse(30);
                    break;

                case 5:
                    heroe.mostrarEstadisticas();
                    villano.mostrarEstadisticas();
                    break;

                case 6:
                    heroe.atacar(villano, 15);
                    break;

                case 0:
                    System.out.println("Fin del juego.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

            // El villano contraataca si ambos siguen vivos
            if (opcion >= 1 && opcion <= 6
                    && heroe.estaVivo() && villano.estaVivo()) {

                if (opcion == 2) {
                    villano.hacerTrampa(heroe);
                } else {
                    villano.atacar(heroe);
                }
            }

            // Comprueba el resultado del combate
            if (!heroe.estaVivo()) {
                System.out.println("El villano ha ganado.");
            } else if (!villano.estaVivo()) {
                System.out.println("El superheroe ha ganado.");
            }

        } while (opcion != 0
                && heroe.estaVivo()
                && villano.estaVivo());

        leer.close();
    }
}
