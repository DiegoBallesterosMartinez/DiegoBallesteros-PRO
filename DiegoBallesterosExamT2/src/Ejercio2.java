import java.util.Scanner;
public class Ejercio2 {

    public static void main(String[] args) {

    Scanner lectorTeclado = new Scanner(System.in);

    int random = (int)(Math.random()*9000)+1000;

        System.out.println("Escribe un numero entero entre 1000 y 9999: ");
        int numero = lectorTeclado.nextInt();

        System.out.printf("El numero ganador es el: %d",random);

        //boolean unidades = (numero);
        // i. Has acertado las unidades: true o false
        // ii. Has acertado las decenas: true o false
        // iii. Has acertado las centenas: true o false
        // iv. Has acertado los millares: true o false
        // v. Has acertado todos: true o false

        boolean unidadesAcertadas = ();
        System.out.printf();

        boolean decenasAcertadas = ();
        System.out.printf();

        boolean centenasAcertadas = ();
        System.out.printf();

        boolean millaresAcertadas = ();
        System.out.printf();

        boolean todasAcertadas = ();
        System.out.printf();
    }
}
