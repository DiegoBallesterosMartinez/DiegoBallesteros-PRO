import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Object[] cosas = {5, "dam", true, 'a', 5.7, 7};
        for (int i = 0; i < cosas.length; i++) {

            if (cosas[i] instanceof String) {
                System.out.println(cosas[i]);
                System.out.println("La longitud de la palabra es: " + ((String) cosas[i]).length());
            }
        }
        // Busquedas -> {1,2,3,4,55545,65475747,...}
        // quiero buscar 7. Recorro y termino cuando encuentro el 7.
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres buscar");
        int numeroUsuario = scanner.nextInt();
        //if (!estaNumero(numeroUsuario,numeros)){

        /*
        boolean respuesta;
        do {
            int numeroUsuario = scanner.nextInt();
            respuesta = estaNumero(numeroUsuario, numeros);
        } while (!respuesta);
         */

        boolean encontrado = false;

        for (int item : numeros) {
            if (item == numeroUsuario) {
                encontrado = true;
                System.out.println("Numero encontrado");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No esta el numero");
        }
    }

    public static boolean estaNumero(int numeroBuscar, int[] conjunto) {

        // {4,7,1,9,3}
        // 8

        for (int item : conjunto) {
            if (item == numeroBuscar) {
                System.out.println("Numero encontrado");
                return true;
            }

        }

        return false;
    }

}

