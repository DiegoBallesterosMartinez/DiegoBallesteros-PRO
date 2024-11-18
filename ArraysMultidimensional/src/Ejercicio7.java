import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        /*1. (AhorcadoArray) Crear un array de String donde se guarden 20 palabras. El sistema deberá de seleccionar una de las palabras pertenecientes al array. Una vez seleccionada se jugará al juego del ahorcado donde la palabra a acertar será la seleccionada. Para ello las normas son las siguientes:
    - Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
    - Se pedirá por pantalla la letra con la que se quiere probar
    - En el caso de acertar se mostrará la letra en la posición correspondiente
    - En el caso de falla se restará una vida
    - El programa continuará hasta que:
    - Acierte la palabra
    - Me quede sin vidas*/

        Scanner lectorTeclado = new Scanner(System.in);

        // Array de palabras para el juego
        String[] palabras = {"programacion", "java", "ordenador", "teclado", "pantalla", "raton", "silla", "mesa", "codigo", "ahorcado", "juego", "computadora", "internet", "redes", "servidor", "cliente", "hardware", "software", "usuario", "sistema"};

        // Selección de una palabra aleatoria del array
        String palabraSeleccionada = palabras[(int) (Math.random() * palabras.length)];

        // Array para almacenar el estado de las letras adivinadas (inicialmente guiones bajos)
        char[] palabraAdivinada = new char[palabraSeleccionada.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }

        int vidas = 5; // Número de vidas del jugador
        boolean palabraAdivinadaCompleta = false;

        System.out.println("¡Bienvenido al juego del ahorcado!");
        System.out.println("Tienes " + vidas + " vidas para adivinar la palabra.");

        // Bucle del juego
        while (vidas > 0 && !palabraAdivinadaCompleta) {
            // Mostrar el estado actual de la palabra a adivinar
            System.out.print("Palabra: ");
            for (char c : palabraAdivinada) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Pedir al usuario que ingrese una letra
            System.out.print("Introduce una letra: ");
            char letra = lectorTeclado.next().toLowerCase().charAt(0);

            // Comprobar si la letra está en la palabra
            boolean acierto = false;
            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    acierto = true;
                }
            }

            // Si no acertó, se resta una vida
            if (!acierto) {
                vidas--;
                System.out.println("Letra incorrecta. Te quedan " + vidas + " vidas.");
            }

            // Comprobar si la palabra ha sido completamente adivinada
            palabraAdivinadaCompleta = true;
            for (char c : palabraAdivinada) {
                if (c == '_') {
                    palabraAdivinadaCompleta = false;
                    break;
                }
            }
        }

        // Mostrar el resultado del juego
        if (palabraAdivinadaCompleta) {
            System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabraSeleccionada);
        } else {
            System.out.println("\nLo siento, te has quedado sin vidas. La palabra era: " + palabraSeleccionada);
        }

        lectorTeclado.close();
    }
}



