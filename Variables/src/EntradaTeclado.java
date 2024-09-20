import java.util.Scanner;

public class EntradaTeclado {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre; // null
        Integer ano;
        Integer altura;
        Boolean experienciaTrabajo;

        System.out.println("Nombre");
        nombre = lectorTeclado.next();
        System.out.println("Cuanto anos tienes");
        ano = lectorTeclado.nextInt();
        System.out.println("Cuanto mides");
        altura = lectorTeclado.nextInt();
        System.out.println("Tienes experiencia trabajando?");
        experienciaTrabajo = lectorTeclado.nextBoolean();

        System.out.println("Mi nombre es " +nombre +"\ntengo " +ano +"\nmido " +altura
                +"\ntengo experiencia trabajado " +experienciaTrabajo);
        // Mi nombre es ...(Diego) tengo ...(21) mido ...(183) y tengo experiencia trabajando ...(true)

    }

}



