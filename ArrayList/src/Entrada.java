import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {


        // Si no ponemos nada será de Object
        ArrayList lista = new ArrayList<>();
        // Para guardar solo enteros:
        ArrayList<Integer> listaEnteros= new ArrayList<>();
        //Para guardar StringS:
        ArrayList<String> listaStrings = new ArrayList<>();

        // Solo en ArrayList para añadir un numero
        lista.add(20);// ahora el tamaño del array es 1 Ejemplo: list{20}
        lista.add(3); // al añadir cosas se añadensiempre al final: list{20,3}

        // Para sutituir una posición
        lista.set(1,45); // Posicion 1 del Array modificada. lista{20,45}

        // Para borrar una posición
        lista.remove(0); // Posicion 0 eliminada, recolocacióndel Array. lista{20,45} --> lista{45}

        // ArrayList con String
        // si tenemos {"hola","adios","dia"}
        // Otra forma de usar remove:
        // listaStrings.remove("dia"); Ahora solo quedaria {"hola,"adios"}

        // Mirar metodo lista.contains y lista.get
        System.out.println(lista.contains(8));
        System.out.println(lista.get(4));

        // Comprobar tamaño
        lista.isEmpty(); // lista size==0
    }
}
