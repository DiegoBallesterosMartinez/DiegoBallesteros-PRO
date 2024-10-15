import java.util.Scanner;

public class Ejercicio1 {

    /*Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
    Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)*/

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        //Numero de temperaturas a tener en cuenta
        System.out.println("Introduce el numero de temperaturas:");
        int numTemperatura=lectorTeclado.nextInt();
        //Si el numero es 0 o negativo vale 10
        if (numTemperatura<=0){
            numTemperatura=10;}
        //Iniciar suma -> acumulador de sumas
        double suma = 0;
        //Leer temperaturas
        for (int i=0;i<numTemperatura;i++){
            System.out.println("Introduce la temperatura" +i+":");
            double temperatura = lectorTeclado.nextDouble();
            //Sumar temperaturas
            //suma+=temperatura
            suma=suma+temperatura;
        }
        //Calculo de la media
        double mediaTemperatura= suma/numTemperatura;
        System.out.println("La suma de las temperaturas es "+suma);
        //System.out.printf("La media de temperatura es de %.2f",suma);
        //Mostrar media con 2 decimales
        System.out.println("La media de temperatura es de "+mediaTemperatura);
        //System.out.printf("La media de temperatura es de %.2f",mediaTemperatura);

    }
}
