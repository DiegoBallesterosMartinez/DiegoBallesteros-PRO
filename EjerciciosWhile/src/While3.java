import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {

        // hacer variable para llamara en dowhile
        int aleatorio, numeroMax = -1, numeroMin = 101;
        // creamos el dowhile
        do {
            // Generar numeros aleatorios entre 0 y 100
            aleatorio = (int) Math.random() * 101;
            // El programa imprime los numeros
            System.out.println(aleatorio);
            if (aleatorio > numeroMax) {
                numeroMax = aleatorio;
                if (aleatorio < numeroMin) {
                    numeroMin = aleatorio;
                }
            }
        } while (aleatorio != 0);

        System.out.println("El numero más grande es "+numeroMax+", el numero mas pequeño es: "+numeroMin);

    }
}
