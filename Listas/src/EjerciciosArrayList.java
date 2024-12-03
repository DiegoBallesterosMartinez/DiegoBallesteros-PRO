import java.util.*;

public class EjerciciosArrayList {
    private static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Ejercicio1();
        //Ejercicio2();
        Ejercicio3();
        Ejercicio4();

    }

    public static void Ejercicio1() {
        // Crear un ArrayList para almacenar 10 palabras
        ArrayList<String> listaPalabras = new ArrayList<>();

        // Solicitar 10 palabras al usuario
        for (int i = 1; i <= 10; i++) { // Cambiar a i=1 para que las posiciones sean más naturales
            System.out.println("Dime la palabra en la posición " + i + ":");
            String palabraTemp = lectorTeclado.next();
            listaPalabras.add(palabraTemp);
        }

        // Imprimir las palabras almacenadas
        System.out.println("Lista de palabras:");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }

        // Crear un ArrayList para almacenar números aleatorios
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int suma = 0;
        int numMayor = 0; // Inicializar al menor valor posible
        int numMenor = 100; // Inicializar al mayor valor posible

        // Agregar 5 números aleatorios entre 0 y 100
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = (int) (Math.random() * 101);
            listaNumeros.add(numeroAleatorio);
        }

        // Calcular la suma, el número mayor y el número menor

        // Se puede abreviar con:
        // Collections.sort(listaNumeros) --> Los ordena de menos a mayor
        // min = listanumeros.getFirst();
        // max = listaNumeros.getLast();

        for (int numero : listaNumeros) {
            suma += numero;

            if (numero > numMayor) {
                numMayor = numero;
            }

            if (numero < numMenor) {
                numMenor = numero;
            }
        }

        // Calcular la media
        double media = (double) suma / listaNumeros.size();

        // Imprimir resultados
        System.out.println("\nNúmeros generados: " + listaNumeros);
        System.out.println("Suma de los números: " + suma);
        System.out.println("Media de los números: " + media);
        System.out.println("Número mayor: " + numMayor);
        System.out.println("Número menor: " + numMenor);
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
            int numeroAleatorio = (int) (Math.random() * 101);
            lista1.add(numeroAleatorio);
        }

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) (Math.random() * 101);
            lista2.add(numeroAleatorio);
        }

        /*
        Otra forma de rellenar arrays llamando a un metodo:

        rellenarArray(lista1);  --> Estas son las llamadas al metodo
        rellenarArray(lista2);  --> Al llamarlos por separado no se duplican los resultados

        metodo:
        public static void rellenarArray(Arraylist<Integer> lista){
            for (int i = 0; i < 20; i++) {
                int numeroAleatorio = (int) (Math.random() * 101);
                lista.add(numeroAleatorio);
            }
        }
         */

        int iguales = 0;
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i).equals(lista2.get(i))) {
                iguales++;
            }
            System.out.println("numeros iguales: " + iguales);
        }

        /*
        Otra forma de hacerlo con metodo seria:
        public static int Iguales(){
            for (int i = 0; i < lista1.size(); i++) {
                if (lista1.get(i).equals(lista2.get(i))) {
                    iguales++;
                }
                return;
            }
        }
         */


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

        // Variables para encontrar las palabras con más y menos letras
        String palabraMasLarga = "";
        String palabraMasCorta = palabras.get(0);

        System.out.println("Lista de palabras y número de letras:");

        int numeroLetras = 0;
        // Muestra el número de letras de todas las palabras
        for (String palabra : palabras) {
            palabra += numeroLetras;

            // Mostrar letras de cada palabra
            System.out.println(palabra + " - " + palabra.length() + " letras");

            // Actualizar la palabra más larga
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }

            // Actualizar la palabra más corta
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
            System.out.println("\n El numero total de letras es de: " + numeroLetras);


            // Mostrar resultados
            System.out.println("\nLa palabra con más letras es: " + palabraMasLarga + " (" + palabraMasLarga.length() + " letras)");
            System.out.println("La palabra con menos letras es: " + palabraMasCorta + " (" + palabraMasCorta.length() + " letras)");
        }
        // Llamada al metodo para ordenar lista
        ordenarLista(palabras);
        // imprimirlo
        for (String item:palabras){
            System.out.println(item);
        }

    }
    // Metodo para ordenar lista
    public static void ordenarLista(ArrayList<String> lista) {
        // Collections.sort(lista); // Ordenar alfabeticamente
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) { // --> Algoritmo de la burbuja // Compara de dos en dos
                if (o1.length()>o2.length()){
                    return 1;
                } else if (o1.length()<o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public static void Ejercicio5678(){

    }
}


