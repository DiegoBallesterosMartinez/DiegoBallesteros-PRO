import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        // Hotel hotel = new Hotel(lectorTeclado);
        // hotel.mostrarMenu();

        // Restaurante restaurante = new Restaurante(lectorTeclado);
        // restaurante.mostrarMenu();

        // Formula1 formula1 = new Formula1();
        // formula1.mostrarMenu();


        PruebaHotel pruebaHotel = new PruebaHotel(lectorTeclado);
        pruebaHotel.mostrarMenu();

        // PruebaRestaurante pruebaRestaurante = new PruebaRestaurante(lectorTeclado);
        // pruebaRestaurante.mostrarMenu();

        // PruebaFormula1 pruebaFormula1 = new PruebaFormula1(lectorTeclado);
        // pruebaFormula1.mostrarMenu();
    }
}
