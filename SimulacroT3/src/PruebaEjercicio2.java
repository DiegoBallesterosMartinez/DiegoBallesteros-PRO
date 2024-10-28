import java.util.Scanner;
public class PruebaEjercicio2 {
    public static void main(String[] args) {

    Scanner lectorTeclado = new Scanner(System.in);

    int contador = 0;
    int suspenso = 0;
    int nota;
    int sumaNota =0;

    while(contador<20){
        System.out.println("Dime nota del alumno");
        nota = lectorTeclado.nextInt();

        if (nota < 0 || nota > 10){
            System.out.println("La nota no es valida");
            sumaNota+= nota;
            contador++;

        } if (nota < 5){
            suspenso++;

        } if (contador > 0){
            double mediaNotas = (double) sumaNota / contador;
            System.out.println("La media de notas es: "+mediaNotas);
        } else {
            System.out.println("No se han introducido notas validas");
        }
    }

        System.out.println("Han suspendido "+suspenso+"personas");


    }
}
