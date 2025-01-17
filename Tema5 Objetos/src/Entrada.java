import model.Coche;

public class Entrada {
    public static void main(String[] args) {

        Coche coche1 = new Coche(); // Este llama al constructor vacío
        Coche coche2 = new Coche("Ford","Focus","Gris");  // Este llama al constructor con Strings
        Coche coche3 = new Coche("Opel","Corsa",200);
        Coche coche4 = new Coche("Opel","Corsa","Negro","1234A",40,15000,"Bastidor");

        // Si solo quiero sacar la marca del coche 3
        System.out.println("la marca del coche 3 es: "+coche3.getMarca());


        System.out.println("Los datos del coche 1 son:");
        coche1.setMarca("Seat");
        coche1.mostrarDatos();

        System.out.println("Los datos del coche 2 son:");
        coche2.mostrarDatos();
        System.out.println("Los datos del coche 3 son:");
        coche3.mostrarDatos();
        System.out.println("Los datos del coche 4 son:");
        coche4.mostrarDatos();


    }
}
