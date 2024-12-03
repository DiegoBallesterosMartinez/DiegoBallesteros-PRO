import java.util.ArrayList;

public class Entrada {



    private  static ArrayList<Integer> listaNumeros = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Utilizando listas");
        System.out.println("El tamaño inicial de la lista es: "+listaNumeros.size());
        anadirNumero((int) (Math.random()*21));
        anadirNumero((int) (Math.random()*21));
        anadirNumero((int) (Math.random()*21));
        obtenerDatos();
    }

    public static void anadirNumero(int numero){
        listaNumeros.add(numero);
        System.out.println("Numero añadido correctamente");
        System.out.println("Lista actualizada con un size de: "+listaNumeros.size());
    }

    public static void obtenerDatos(){
        System.out.println("El último elemento del arraylist es: "+listaNumeros.get(2));
        // Se puede buscar el primer numero con get.first --> get(0)
        // Se puede buscar el último numero con get.last --> get((arraylist.size)-1)

        for (int item : listaNumeros){
            System.out.println(item);
        }
    }


}
