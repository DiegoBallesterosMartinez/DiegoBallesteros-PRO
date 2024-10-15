import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = lectorTeclado.next();

        System.out.println("Apellido:");
        String apellido = lectorTeclado.next();

        System.out.println("Cuanto vale la play 5, ten en cuenta que es sin IVA");
        double play5 = lectorTeclado.nextDouble();

        System.out.println("precio iphone 15, ten en cuenta que es sin IVA");
        double iphone15 = lectorTeclado.nextDouble();

        System.out.println("IVA actual");
        double iva = lectorTeclado.nextDouble();

        System.out.println("¿Cuanto dinero tienes?");
        double dinero = lectorTeclado.nextDouble();


        double calculoiva = iva/100;

        // puedes comprar play?
        boolean comprarplay = (dinero>=(play5*calculoiva));
        System.out.println("Te puedes comprar la play: " +comprarplay);
        // puedes comprar iphone15?
        boolean comprariphone15 = (dinero>=(iphone15*calculoiva));
        System.out.println("Te puedes comprar el iphone15: " +comprariphone15);
        // puedes comprar ambos?
        boolean comprarambos = (dinero>=(iphone15+play5)*calculoiva);
        System.out.println("Te puedes comprar las dos cosas: " +comprarambos);

    }
}
