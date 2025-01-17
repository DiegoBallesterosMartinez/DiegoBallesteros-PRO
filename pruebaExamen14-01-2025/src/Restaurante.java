import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Restaurante {

    private Scanner lectorTeclado;

    // constructor
    public Restaurante(Scanner lectorTeclado){
        this.lectorTeclado= lectorTeclado;
    }

    private final String[][] consumiciones = new String[][]{{"bocata","5,50"},{"bebida","3.00"}};
    private Hashtable<String,Object[]>listaMesa=new Hashtable<>();
    private final double bocadillo = 5.5;
    private double bebida = 3.0;
    private final int maxMesas = 10;

    public void asignarMesa() {
        System.out.println("Dime tu nombre: ");
        String nombreCliente = lectorTeclado.next(); // Leer el nombre del cliente

        System.out.println("Dime cuál es tu mesa: ");
        String numeroMesa = lectorTeclado.next(); // Leer el número de la mesa

        System.out.println("Tenemos para vender:");
        System.out.println("1. Bocatas 5.50$");
        System.out.println("2. Bebidas 3.00$");

        // Verificar si la mesa ya está reservada
        if (listaMesa.containsKey(numeroMesa)) {
            System.out.println("Error: Ya hay una reserva para la mesa " + numeroMesa + ".");
        } else {
            // Crear el pedido y registrar la reserva
            Object[] mesa = {nombreCliente, numeroMesa, new ArrayList<String>(), 0.0};
            listaMesa.put(numeroMesa, mesa);
            System.out.println("Reserva realizada con éxito para " + nombreCliente + " en la mesa " + numeroMesa + ".");
        }
    }


    public void liberarMesa(){
        System.out.println("Dime las mesas que quieres liberar ");
        String numeroMesa= lectorTeclado.next();

        if (numeroMesa.isEmpty()){
            System.out.println("La mesa esta vacia");
        }else{
            Object[] mesa = listaMesa.remove(numeroMesa);
            double precioTotal = (double) mesa[3];
            System.out.println("Total a pagar: "+precioTotal);

        }
    }
    public void realizarPedido(){
        System.out.println("¿Cuántos bocadillos quieres?");
        int bocadillos = lectorTeclado.nextInt();

        System.out.println("¿Cuántas bebidas quieres?");
        int bebidas = lectorTeclado.nextInt();

        System.out.println("¿Para qué mesa es el pedido?");
        int mesa = lectorTeclado.nextInt();

        if (listaMesa.containsKey(mesa)) {
            Object[] reserva = listaMesa.get(mesa);
            ArrayList<String> pedido = (ArrayList<String>) reserva[2];
            double precioTotal = (double) reserva[3];

            for (int i = 0; i < bocadillos; i++) {
                pedido.add("Bocadillo");
                precioTotal += 5.50;
            }

            for (int i = 0; i < bebidas; i++) {
                pedido.add("Bebida");
                precioTotal += 2.50;
            }

            reserva[2] = pedido;
            reserva[3] = precioTotal;
            System.out.println("Pedido realizado para mesa " + mesa);
            System.out.println("Total a pagar: " + precioTotal + "€.");
        } else {
            System.out.println("La mesa no está ocupada.");
        }
    }
}
