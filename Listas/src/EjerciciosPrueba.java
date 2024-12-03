import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosPrueba {
    private static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Ejercico1();
        //Ejercicio2();
        //Ejercicio3();
        Ejercicio4();

    }

    public static void Ejercico1() {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("una");
        palabras.add("dola");
        palabras.add("tela");
        palabras.add("catola");
        palabras.add("hello");
        palabras.add("sol");
        palabras.add("luna");
        palabras.add("aburro");
        palabras.add("perro");
        palabras.add("gato");


    }

    public static void Ejercicio2() {
        ArrayList<String> alumnos = new ArrayList<>();

        // Pedir al usuario que ingrese nombres de compañeros
        System.out.println("Introduce los nombres de tus compañeros. Escribe 'FIN' para terminar:");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = lectorTeclado.nextLine();

            if (nombre.equalsIgnoreCase("FIN")) {
                break; //
            }

            alumnos.add(nombre);
        }

        // Verificar si hay al menos un nombre en la lista
        if (alumnos.isEmpty()) {
            System.out.println("No se ingresaron nombres.");
            return;
        }

        // Seleccionar un nombre aleatorio
        int nombreAleatorio = (int) (Math.random() * alumnos.size());
        String nombreSeleccionado = alumnos.get(nombreAleatorio);

        System.out.println("El compañero seleccionado es: " + nombreSeleccionado);

    }

    public static void Ejercicio3() {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) (Math.random() * 100);
            lista1.add(numeroAleatorio);
        }

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) (Math.random() * 100);
            lista2.add(numeroAleatorio);
        }

        System.out.println("\nMostrando array lista1:\n" + lista1);

        int iguales = 0;
        for (int i = 0; i < lista1.size(); i++) {

            if (lista1.get(i).equals(lista2.get(i))) {

                iguales++;
            }

            System.out.println("numeros iguales: " + iguales);
        }
    }

    public static void Ejercicio4() {
        // Crear un ArrayList y añadir 10 palabras
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("manzana");
        palabras.add("elefante");
        palabras.add("coche");
        palabras.add("estrella");
        palabras.add("sol");
        palabras.add("ordenador");
        palabras.add("ventana");
        palabras.add("pintura");
        palabras.add("libro");
        palabras.add("luz");

        // Crear variables palabrass larga y corta
        String palabraLarga = "";
        String palabraCorta = palabras.get(0);

        // Mostrar numero letras de todas las palabras
        for (String item : palabras) {
            System.out.println("palabra " + (item) + " tiene " + item.length() + " letras");


            if (palabraCorta.length() > item.length()) {
                palabraCorta = item;

            }

            if (palabraLarga.length() < item.length()) {
                palabraLarga = item;

            }
        }
        System.out.println("\nLa palabra mas corta es: " + palabraCorta);
        System.out.println("La palabra mas larga es: " + palabraLarga);
    }
}









