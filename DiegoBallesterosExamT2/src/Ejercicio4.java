import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = lectorTeclado.next();

        System.out.println("Apellido:");
        String apellido = lectorTeclado.next();

        System.out.println("Sueldo que espera recibir:");
        int sueldo = lectorTeclado.nextInt();

        System.out.println("Edad:");
        int edad = lectorTeclado.nextInt();

        System.out.println("Fecha cumpleanos: ej:(27)");
        int cumpleanos = lectorTeclado.nextInt();

        System.out.println("¿Tienes carnet de conducir?: (Responda con si o no)");
        String preguntacarnet = lectorTeclado.next();

        boolean carnecoche;


        if ((preguntacarnet == "si")) {
            carnecoche = true;
        } else carnecoche = false;

        boolean candidatovalido = ((edad<50 && sueldo<=40000 && carnecoche)||(edad>45 && sueldo<20000 && cumpleanos%2==0));

        System.out.println("Eres valido: "+candidatovalido);

    }
}
