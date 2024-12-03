import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Dime tu nombre:");
        String nombre = lectorTeclado.nextLine();
        System.out.println("Dime tu teléfono:");
        int telefono = lectorTeclado.nextInt();

        System.out.println("Dime cantidad de ingredientes:");
        int cantidad = lectorTeclado.nextInt();
        do {
            if (cantidad<1){
                System.out.println("no puede haber menos de 1 ingrediente");
                System.out.println("Dime cantidad de ingredientes:");

            }
        } while (cantidad<1) ;

        String[]pizza = new String[cantidad];
        String[] ingredientes = new String[]{
                "tomate", "queso", "bacon", "atun", "cebolla"
        };
        double producto = 10;
        double tomateP = 0.75;
        double quesoP = 1;
        double baconP = 1.20;
        double atunP = 1;
        double cebollaP = 1.10;

        int numTomate = 0;
        int numQueso = 0;
        int numBacon = 0;
        int numAtun = 0;
        int numCebolla = 0;

        int opcion=0;

        do {
            System.out.println("Lista Ingredientes:");
            System.out.println("1. Añadir Tomate(0.75)");
            System.out.println("2. Añadir Queso(1.00)");
            System.out.println("3. Añadir Bacon(1.20)");
            System.out.println("4. Añadir Atun(1.00)");
            System.out.println("5. Añadir Cebolla(1.10)");
            System.out.print("Elige una opción: ");

            opcion = lectorTeclado.nextInt();  // Leer opción del usuario

            switch (opcion) {
                case 1:
                    System.out.println("Se añadió Tomate");
                    producto += tomateP;
                    numTomate++;
                    break;
                case 2:
                    System.out.println("Se añadió Queso");
                    producto += quesoP;
                    numQueso++;
                    break;
                case 3:
                    System.out.println("Se añadió Bacon");
                    producto += baconP;
                    numBacon++;
                    break;
                case 4:
                    System.out.println("Se añadió Atún");
                    producto += atunP;
                    numAtun++;
                    break;
                case 5:
                    System.out.println("Se añadió Cebolla");
                    producto += cebollaP;
                    numCebolla++;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != pizza.length);

        System.out.println("Resumen de tu pedido:");
        System.out.println("Tomate: " + numTomate);
        System.out.println("Queso: " + numQueso);
        System.out.println("Bacon: " + numBacon);
        System.out.println("Atún: " + numAtun);
        System.out.println("Cebolla: " + numCebolla);
        System.out.println("Total a pagar: " + producto+"€");


    }
}
