import java.util.ArrayList;
import java.util.Scanner;

public class PruebaEjercicio {
    static Scanner lectorTeclado = new Scanner(System.in);

    // Pedir usuario numero a añadir --> añadir 4 numeros
    // Añadirlo a la lista
    // Si el numero ya está en la lista pedir confirmación
    // Si no está, se agrega directamente

    private static ArrayList<Integer> listaNumeros = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Utilizando listas");
        System.out.println("El tamaño inicial de la lista es: " + listaNumeros.size());
        anadirNumero(98);
        anadirNumero(13);
        anadirNumero(23);
        anadirNumero(13);
        obtenerDatos();
    }

    public static void anadirNumero(int numero) {
        if (listaNumeros.contains(numero)) {
            System.out.println("Estás seguro de volver a añadirlo a la lista?");
            String respuesta =lectorTeclado.next();
            if (respuesta.equalsIgnoreCase("y")){
                listaNumeros.add(numero);
                System.out.println("Numero añadido correctamente");
                System.out.println("Lista actualizada con un size de: " + listaNumeros.size());
            } else {}
            System.out.println("Saliendo de anadir numeros");
        } else {
        listaNumeros.add(numero);
        System.out.println("Numero añadido correctamente");
        System.out.println("Lista actualizada con un size de: " + listaNumeros.size());
        }
    }

    public static void obtenerDatos() {
        System.out.println("El último elemento del arraylist es: " + listaNumeros.get(2));
        // Se puede buscar el primer numero con get.first --> get(0)
        // Se puede buscar el último numero con get.last --> get((arraylist.size)-1)

        for (int item : listaNumeros) {
            System.out.println(item);
        }
    }

    // TODO cambiar el retorno al índice donde está el repetido
    public static int  encontrarNumero(int numero){
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i)==numero){
                return (i);
            }
        }
        return -1; // Posicion -1 no existe, se usa para reafirmar que no se encuentra el numero
    }
}
