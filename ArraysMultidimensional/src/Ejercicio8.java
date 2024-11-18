import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        /*1. (InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible. Para ello el programadebe:
- pedir el número de participantes (de ser impar saltará un fallo)
- pedir el nombre de cada uno de los participantes
- sacar por pantalla el orden de las parejas resultantes*/


        Scanner lectorTeclado = new Scanner(System.in);

        // Pedir el número de participantes
        System.out.print("Introduce el número de participantes: ");
        int numParticipantes = lectorTeclado.nextInt();

        // Verificar si el número de participantes es impar
        if (numParticipantes % 2 != 0) {
            System.out.println("Error: el número de participantes debe ser par.");
            lectorTeclado.close();
            return;
        }

        // Crear una lista para almacenar los nombres de los participantes
        String[] participantes = new String[numParticipantes];

        // Pedir los nombres de los participantes
        lectorTeclado.nextLine();  // Limpiar el buffer
        for (int i = 0; i < numParticipantes; i++) {
            System.out.print("Introduce el nombre del participante " + (i + 1) + ": ");
            participantes[i] = lectorTeclado.nextLine();
        }

        // Crear un array temporal para almacenar los participantes en orden aleatorio
        String[] participantesMezclados = new String[numParticipantes];
        boolean[] usado = new boolean[numParticipantes]; // Para evitar repetición

        // Mezclar los participantes manualmente usando Math.random()
        for (int i = 0; i < numParticipantes; i++) {
            int indiceAleatorio;
            do {
                indiceAleatorio = (int) (Math.random() * numParticipantes);
            } while (usado[indiceAleatorio]); // Repetir si el índice ya se usó
            participantesMezclados[i] = participantes[indiceAleatorio];
            usado[indiceAleatorio] = true;
        }

        // Mostrar las parejas resultantes
        System.out.println("\nParejas de amigos invisibles:");
        for (int i = 0; i < participantesMezclados.length; i += 2) {
            System.out.println(participantesMezclados[i] + " - " + participantesMezclados[i + 1]);
        }
    }
}
