import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        final int PinCorrecto = 1234;

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce PIN");
            int try1 = lectorTeclado.nextInt();
            if (PinCorrecto == try1) {
                System.out.println("Perfecto, la caja ha sido abierta");
                break;
            } else if (i<3){
                System.out.println("Intento fallido, prueba de nuevo");
            } else {
                System.out.println("Lo siento, caja bloqueada");

            }
        }
    }
}
