import java.util.ArrayList;
import java.util.Collections;

public class Garaje {

    private ArrayList<Object[]> listaCoches = new ArrayList<>(5);

    // No añadimos Static para que no se pueda llamar sin la clase
    public void anadirCoche(String marca, String modelo, int cv, String matricula) {
        if (listaCoches.size() < 5) {
            if (!matriculaRepetida(matricula)) {


                Object[] coche = new Object[]{marca, modelo, cv, matricula};
                listaCoches.add(coche);
                System.out.println("Coche añadido: " + marca + " - " + modelo + " - " + cv + "CV - " + matricula);
            } else {
                System.out.println("Ya existe un coche con la misma matrícula");
            }
        } else {
            System.out.println("Garaje completo");
            System.out.println("No se pueden anadir mas coches");
        }
    }

    public void mostrarCoches() {
        if (!listaCoches.isEmpty()) {
            for (Object[] coche : listaCoches) {
                System.out.println(coche[0] + " - " + coche[1] + " - " + coche[2] + " - " + coche[3]);
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    private boolean matriculaRepetida(String matricula) {
        for (Object[] coche : listaCoches) {
            if (coche[3].equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public void cochesMarca(String marca) {
        boolean encontrado = false;

        System.out.println("\nListado de coches con marca: "+marca);
        for (Object[] coche : listaCoches) {
            if (coche[0].equals(marca)) {
                encontrado = true;
                System.out.println(coche[0] + " - " + coche[1] + " - " + coche[2] + "CV - " + coche[3]);
            }
        }
        if (!encontrado) {
            System.out.println("No hay ningún coche con esta marca.");
        }
    }

    // si lista vacia enviar mensaje
    // no mas de 5 coches --> garaje completo
    // no puede haber 2 coches con la misma matricula

    // Pedir marca, mostrar los coches cone esa marca

}
