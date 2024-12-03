import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class ArrayListPalabras {

    // Pedir usuario numero a añadir --> añadir 4 numeros
    // Añadirlo a la lista
    // Si el numero ya está en la lista pedir confirmación
    // Si no está, se agrega directamente

    private static Scanner lectorTeclado = new Scanner(System.in);
    private static ArrayList<String> listaPalabras = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Utilizando listas");
        System.out.println("El tamaño inicial de la lista es: " + listaPalabras.size());

        listaPalabras.add("Palabra 1");
        listaPalabras.add("Palabra 2");
        listaPalabras.add("Palabra 3");
        listaPalabras.add("Palabra 4");
        listaPalabras.add("Palabra 5");

        // Borrar "Palabra 1"
        listaPalabras.remove(0);
        // Borrar elemento "Palabra 5"
        listaPalabras.remove("Palabras 5");
        // Borrar todas las palabras que contengan "x"
        listaPalabras.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.contains("5")) {
                    return true;
                } else {
                    return false;
                }
            }
            // Se hace más rápido con:
            // return (s.contains("5"))
        });


        for (String item : listaPalabras) {
            System.out.println(item);
        }
    }

}
