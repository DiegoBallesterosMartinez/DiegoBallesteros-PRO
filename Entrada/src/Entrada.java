public class Entrada {

    // Vista
    public static void main(String[] args) {
        Garaje garaje = new Garaje(); // Esto es una llamada a una clase de otra pestaña
        System.out.println("Bienvenido a la gestion de coches");
        garaje.anadirCoche("Mercedes","c220",200,"1234A");
        garaje.anadirCoche("Ford","Fiesta",100,"1234B");
        garaje.mostrarCoches();
        garaje.cochesMarca("Mercedes");
    }
}
