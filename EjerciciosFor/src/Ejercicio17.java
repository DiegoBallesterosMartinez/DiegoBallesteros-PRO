import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);


        System.out.println("dime que numero quieres calcular el factor");
        int numero = lectorTeclado.nextInt();
        int factorial = 1;
        if (numero<1){
            System.out.println("No puedo calculr su factorial");
        } else {
            for (int i = 1; i <=numero ; i++) {
                factorial = factorial*1;
            }
        }
        System.out.printf("El factorial del numero %d es %d",numero,factorial);

    }
}
