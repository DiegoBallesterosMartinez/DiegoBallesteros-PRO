import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {


        Scanner lectorTeclado = new Scanner(System.in);


        // Hotel hotel = new Hotel(lectorTeclado);
        // hotel.mostrarMenu();

        Restaurante restaurante = new Restaurante(lectorTeclado);
        restaurante.asignarMesa();
    }
}
