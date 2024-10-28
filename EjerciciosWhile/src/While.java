import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        //pedir por consola numeros hasta que el usuario diga 0

        /*
        int i = 0;
        int numero = -1;

        while (numero != 0) {

            // pido numeros
                    i++;
            System.out.println("dime un numero");
            numero = lectorTeclado.nextInt();
        }

        System.out.println("has introducido "+i+" numeros");
        */


        int i = 0;
        int numero = lectorTeclado.nextInt();

        do {
            System.out.println("Introduce numero");
            i++;
        } while (numero != 0);

        System.out.println("el numero de introducidos es: " + i);

    }
}
