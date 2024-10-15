import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Introduzca el tipo de cafe que quiere, ej:(capuchino, espresso, latte)");
        String tipoCafe = lectorTeclado.nextLine();

        System.out.println("Introduzca el tamano que quiere: (pequeño, mediano, grande)");
        String tamano = lectorTeclado.nextLine();

        System.out.print("Introduzca cuanto azucar quiere");
        int cantidadAzucar = lectorTeclado.nextInt();


        System.out.printf("Preparando un %s de tamano %s con %d cucharaditas de azucar",tipoCafe,tamano,cantidadAzucar);

    }
}
