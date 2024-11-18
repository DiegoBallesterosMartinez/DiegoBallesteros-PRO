import java.util.Scanner;

public class Ejercicio9Borja {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Crear array");
            System.out.println("2. Rellenar aleatorios");
            System.out.println("3. Rellenar consola");
            System.out.println("4. Ordenar Array");
            System.out.println("5. Clonar array");
            System.out.println("6. Mover izq");
            System.out.println("7. Mover derecha");
            System.out.println("8. Mover por pares");
            System.out.println("9. Invertir");
            System.out.println("10. ");
            opcion = lectorTeclado.nextInt();


            int[] numeros = new int[0];
            switch (opcion) {
                case 1:
                    System.out.println("vas a generar un array");
                    System.out.println("¿Cuantas posiciones quieres reservar?");
                    int reserva = lectorTeclado.nextInt();
                    numeros = new int[];
                    break;

                System.out.println("Creado correctamente");
                case 2:

                case 3:
                    if (numeros != null) {
                        System.out.println("vas a rellenar aleatorios");
                    }else {
                        System.out.println("No se puede realizar");
                    }
                    break;

                // IMPORTANTE
                case 6:
                    if (numeros != null) {

                        System.out.println("Vas a rotar a la izquierda");
                        //guardar el primer numero para no perderlo
                        int temporal = numeros[0];
                        for (int i = 0; i < numeros.length - 2; i++) {
                            numeros[i] = numeros[i + 1];
                        }
                        numeros[numeros.length - 1] = temporal;
                    }else {
                        System.out.println("No se puede realizar");
                    }
                    break;

                // IMPORTANTE
                case 7:
                    if (numeros != null) {

                        System.out.println("Vas a rotar a la derecha");
                        int temporal = numeros.length - 1;
                        for (int i = numeros.length - 1; i > 0; i--) {
                            numeros[i] = numeros[i - 1];
                        }
                    }else {
                        System.out.println("No se puede realizar");
                    }break;

                // ROTAR POR PARES
                case 8:
                    if (numeros!=null){


                        for (int i = 0; i < numeros.length; i+=2) {
                            int temporal= numeros[i];
                            numeros[i] = numeros[i+1];
                            numeros[i+1] = temporal;
                        }
                    } else {
                        System.out.println("No se puede realizar");
                    }
                        break;

                // INVERTIR
                case 9:
                    if (numeros!=null){
                        for (int i = 0; i < numeros.length/2; i++) {
                            int temporal = numeros[i];
                            numeros[i]= numeros[numeros.length-1-i];
                            numeros[i+1] = temporal;

                        }
                    }else {
                        System.out.println("No se puede realizar");
                    }break;

                case 10:
                    if (numeros != null) {
                        for (int item : numeros) {
                            System.out.println(item);

                        }
                    }

            }

        } while ();
    }
}