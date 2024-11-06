import com.sun.jdi.Value;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);


        System.out.println("Di un numero");
        int numero = lectorTeclado.nextInt();

        int suma = 0;
        int grande= 0;
        int pequeno = 100;

        int random = 0;
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * 100 + 1);
            System.out.println("numeros random:" + random);
            suma += random;

            // almacenar grande y pequeno
            if (random>grande){
                grande=random;
            }
            if (random<pequeno){
                pequeno=random;
            }

        }
        System.out.println("\nEl numero mas grande: "+grande);

        System.out.println("El numero mas pequeño: "+pequeno);

        int media = suma / 10;
        System.out.println("El numero medio generado: " + media);

        // Suma += random
        System.out.println("La suma de todos los numeros: " + suma);

        // boolean acertar
        boolean acertar = (numero==random);
        System.out.println("Has acertado algun numero: "+acertar);

        /* if/else en vez de boolean

        if (numero == random) {
            System.out.println("has acertado algun numero");
        } else {
            System.out.println("No has acertado ningun numero");
        }*/


    }
}

