import java.util.Scanner;
import java.util.Hashtable;
import java.util.ArrayList;

public class Formula1 {

    private Hashtable<Integer, Object[]> campeonato;
    private int carreras = 0;
    Scanner lectorTeclado = new Scanner(System.in);

    // constructor
    public Formula1() {
        campeonato = new Hashtable<>();
    }

    public void agregarPiloto() {
        System.out.print("Ingrese nombre: ");
        String nombre = lectorTeclado.next();

        System.out.print("Ingrese numero de bastidor: ");
        int bastidor = lectorTeclado.nextInt();

        System.out.print("Ingrese puntos iniciales: ");
        int puntos = lectorTeclado.nextInt();

        if (!campeonato.containsKey(bastidor)) {
            Object[] piloto = new Object[]{nombre, bastidor, puntos};
            campeonato.put(bastidor, piloto);
            System.out.println("\nPiloto añadido con éxito.");
        } else {
            System.out.println("\nError: Ingreso duplicado.");
        }
    }

    public void mostrarPiloto() {
        System.out.println("Dime el numero de bastidor que quieres buscar");
        int bastidor = lectorTeclado.nextInt();
        if (campeonato.containsKey(bastidor)) {
            Object[] piloto = campeonato.get(bastidor);
            System.out.println("\nNombre: " + piloto[0] + ", Bastidor: " + piloto[1] + ", Puntos: " + piloto[2]);
        } else {
            System.out.println("\nError: No se encontró ningún piloto con ese número de bastidor.");
        }
    }

    // Actualizar puntos de los pilotos
    public void actualizarPuntos() {
        if (carreras >= 7) {
            System.out.println("Ya se han repartido los puntos de todas las carreras.");
            return;
        }

        // Generamos los puntos aleatorios (sin repetidos entre 1 y 12)
        ArrayList<Integer> puntosDisponibles = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            puntosDisponibles.add(i);
        }
        for (int i = 0; i < puntosDisponibles.size(); i++) {
            int puntosRandom = (int) (Math.random() * puntosDisponibles.size());
            int temp = puntosDisponibles.get(i);
            puntosDisponibles.set(i, puntosDisponibles.get(puntosRandom));
            puntosDisponibles.set(puntosRandom, temp); // Barajamos los puntos
        }

        // Repartir puntos aleatorios
        int i = 0;
        for (Object[] piloto : campeonato.values()) {
            if (i >= puntosDisponibles.size()) break; // salir si no hay mas
            int puntos = puntosDisponibles.get(i); // obtener puntos
            int puntosAcumulados = (int) piloto[2]; // puntos piloto
            piloto[2] = puntosAcumulados + puntos; // actualizar puntos
            i++;
        }

        carreras++; // Incrementar numero carreras
        System.out.println("Puntos actualizados con éxito.");
    }

    // Mostrar clasificación (mayor a menor)
    public void mostrarClasificacion() {
        ArrayList<Object[]> listaPilotos = new ArrayList<>();
        for (Object[] piloto : campeonato.values()) {
            listaPilotos.add(piloto);
        }

        // Ordenar pilotos
        for (int i = 0; i < listaPilotos.size() - 1; i++) {
            for (int j = i + 1; j < listaPilotos.size(); j++) {
                int puntos1 = (int) listaPilotos.get(i)[2];
                int puntos2 = (int) listaPilotos.get(j)[2];
                if (puntos1 < puntos2) {
                    // cambiar el orden del piloto
                    Object[] temp = listaPilotos.get(i);
                    listaPilotos.set(i, listaPilotos.get(j));
                    listaPilotos.set(j, temp);
                }
            }
        }

        System.out.println("\nClasificación actual del campeonato:");
        for (Object[] piloto : listaPilotos) {
            System.out.println("Piloto: " + piloto[0] + ", Bastidor: " + piloto[1] + ", Puntos: " + piloto[2]);
        }
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar piloto");
            System.out.println("2. Buscar piloto");
            System.out.println("3. Actualizar puntos");
            System.out.println("4. Mostrar clasificación");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = lectorTeclado.next();

            switch (opcion) {
                case "1":
                    agregarPiloto();
                    break;
                case "2":
                    mostrarPiloto();
                    break;
                case "3":
                    actualizarPuntos();
                    break;
                case "4":
                    mostrarClasificacion();
                    break;
                case "5":
                    System.out.println("Saliendo de la aplicación...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}