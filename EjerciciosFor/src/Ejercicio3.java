import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        /*Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con
        el formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)*/

        System.out.println("Dime un numero del 1 al 10");

        int numero=lectorTeclado.nextInt();
        for (int i=0;i<=10;i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j=0;j<=10;j++) {
                //tabla de multiplicar de i
                System.out.printf("\t%d*%d=%d\n", i,j,i*j);


            }
        }
    }
}
