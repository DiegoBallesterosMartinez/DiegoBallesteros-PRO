import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        Ejercicio2 ejercicio2 = new Ejercicio2(lectorTeclado);
        ejercicio2.agregarAlumnos();

        // Ejercicio3 ejercicio3 = new Ejercicio3(lectorTeclado);
        // ejercicio3.mostrarMenu();
    }
}
