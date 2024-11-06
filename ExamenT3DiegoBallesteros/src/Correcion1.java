import java.util.Scanner;
public class Correcion1 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);



        do {

            int num1;
            int num2;
            int opcion;

            do {
                System.out.println("introduce operando 1");
                int num1 = lectorTeclado.nextInt();
                System.out.println("introduce operando 2");
                int num2 = lectorTeclado.nextInt();
            } while (num1 < 0 && num2 < 0);
            // garantizo que ambos son positivos

            System.out.println("introduce una opcion generada");
            System.out.println("suma");
            System.out.println("resta");
            System.out.println("multi");
            System.out.println("division");
            System.out.println("salir");
            System.out.println("que quieres hacer");

            switch (opcion){

            }
        } while (opcionn !=5);


    }
}
