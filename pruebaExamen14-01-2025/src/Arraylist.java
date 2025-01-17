import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1() {
        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("1");
        palabras.add("dos");
        palabras.add("tres");
        palabras.add("cuatro");
        palabras.add("cinco");
        palabras.add("seis");
        palabras.add("siete");
        palabras.add("ocho");
        palabras.add("nueve");
        palabras.add("diez");

        for (String item : palabras) {
            System.out.println("Las palabras son: " + item);
        }
    }

    public static void ejercicio2() {
        ArrayList<String> listaNombres = new ArrayList<>();

        listaNombres.add("Diego");
        listaNombres.add("Alex");
        listaNombres.add("Ikram");
        listaNombres.add("Jorge");
        listaNombres.add("Luis");

        int random = (int) (Math.random() * listaNombres.size());
        System.out.println("Nombre aleatorio: " + listaNombres.get(random));
    }

    public static void ejercicio3() {
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int aleatorio = (int) (Math.random() * 100);
            numeros1.add(aleatorio);
        }
        for (int i = 0; i < 20; i++) {
            int aleatorio = (int) (Math.random() * 100);
            numeros2.add(aleatorio);
        }

        int iguales = 0;
        for (int i = 0; i < 20; i++) {
            if (numeros1.get(i).equals(numeros2.get(i))) {
                iguales++;
            }
        }
        System.out.println("Lista numeros1: " + numeros1);
        System.out.println("Lista numeros2: " + numeros2);
        System.out.println("numeros iguales: " + iguales);
    }

    public static void ejercicio4() {
        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("uno");
        listaPalabras.add("dos");
        listaPalabras.add("tres");
        listaPalabras.add("cuatro");

        for (int i = 0; i < listaPalabras.size(); i++) {
            System.out.println("la palabra " + listaPalabras.get(i) + " tiene " + listaPalabras.get(i).length() + " caracteres");
        }

        String palabraMayor = "";
        String palabraMenor = listaPalabras.get(0);

        for (int i = 0; i < listaPalabras.size(); i++) {
            if (listaPalabras.get(i).length() < palabraMenor.length()) {
                palabraMenor = listaPalabras.get(i);
            }
        }

        for (int i = 0; i < listaPalabras.size(); i++) {
            if (listaPalabras.get(i).length() > palabraMayor.length()) {
                palabraMayor = listaPalabras.get(i);
            }
        }

        System.out.println("Palabra mayor es: " + palabraMayor);
        System.out.println("Palabra menor es: " + palabraMenor);
    }

    public static void ejercicio5() {

    }
}
