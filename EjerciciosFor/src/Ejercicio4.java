import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        /*Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con
        el formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)*/

        System.out.println("Dime el numero inicial");
        int numeroInicial = lectorTeclado.nextInt();
        System.out.println("¿Cual es el numero final?");
        int numeroFinal = lectorTeclado.nextInt();

        if (numeroInicial>=numeroFinal) {
            System.out.println("No se puede calcular, el primer numero es menor o igual al segundo");
        }
            else {
                System.out.println("Se puede calcular, el primer número es menor que el segundo.");
                }


        int numero=lectorTeclado.nextInt();
        for (int i=numeroInicial;i<=numeroFinal;i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j=0;j<=10;j++) {
                //tabla de multiplicar de i
                System.out.printf("\t%d*%d=%d\n", i,j,i*j);


            }
        }
    }
}
