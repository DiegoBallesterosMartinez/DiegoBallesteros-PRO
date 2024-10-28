import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioWhile {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Elige una opción entre 1 y 5:");
            System.out.println("1. Añadir");
            System.out.println("2. Borrar");
            System.out.println("3. Clonar");
            System.out.println("4. Buscar");
            System.out.println("5. Salir");
            System.out.print("Introduce tu opción: ");
            opcion=lectorTeclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Elegiste Añadir");
                    break;
                case 2:
                    System.out.println("Elegiste Borrar");
                    break;
                case 3:
                    System.out.println("Elegiste Clonar");
                    break;
                case 4:
                    System.out.println("Elegiste Buscar");
                    break;
                case 5:
                    System.out.println("Elegiste Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta, elegi un numero de nuevo:");
            }

            // Validar si la entrada es un número
        } while (opcion >= 1 && opcion <= 5); {
                System.out.println("Por favor, introduce un número válido.");
                lectorTeclado.next(); // Descarta la entrada inválida
            };



            System.out.println("Tu numero no es valido\nCerrando el programa");

    }


}

