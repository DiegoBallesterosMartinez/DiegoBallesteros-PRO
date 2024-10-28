import java.util.Scanner;

public class While5y6 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int numeroGenerado = (int) Math.random() * 21;
        int numeroUsuario = 0;
        int intentosUsuario = 0;
        int intentosJuego = 5;

        String repetir;

        do {
            System.out.println("Introduce un numero");
            numeroUsuario = lectorTeclado.nextInt();
            intentosJuego--;
            intentosUsuario++;

            if (numeroGenerado == numeroUsuario) {
                System.out.println("Enhorabuena, lo has acertado");
            } else {
                System.out.println("Lo siento, has fallado, intenta de nuevo");
            }
        } while (numeroGenerado != numeroUsuario || intentosJuego > 0);

        System.out.println("Quieres volver a jugar: (S/N)");
        repetir = lectorTeclado.next();




    }
}
