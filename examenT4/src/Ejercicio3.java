import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio3 {

    private Scanner lectorTeclado;
    private Hashtable<String,Object[]>listaUsuarios= new Hashtable<>();

    public Ejercicio3(Scanner lectorTeclado){
        this.lectorTeclado =lectorTeclado;
    }
    public void agregarPersona(){
        System.out.println("Dime nombre");
        String nombre = lectorTeclado.next();

        System.out.println("Dime apellido");
        String apellido = lectorTeclado.next();

        System.out.println("Dime telefono");
        int telefono = lectorTeclado.nextInt();

        System.out.println("Dime dni");
        String dni = lectorTeclado.next();

        System.out.println("Dime disponibilidad (S/N)");
        String disponibilidad = lectorTeclado.next();

        if (listaUsuarios.containsKey(dni)){
            System.out.println("este usuario ya esta registrado");
        } else {
            Object[] usuario = {nombre,apellido,telefono,dni,disponibilidad};
            listaUsuarios.put(dni,usuario);
            System.out.println("Usuario añadido correctamente");
        }
    }

    public void buscarPersona(){
        System.out.println("\nDime dni de usuario a buscar:");
        String dni = lectorTeclado.next();
        if (listaUsuarios.containsKey(dni)){
            Object[] usuario = listaUsuarios.get(dni);
            System.out.println("Persona asociada a este dni:");
            System.out.println("Nombre: "+usuario[0]+", Apellido: "+usuario[1]+", Teléfono: "+usuario[2]+"\n");
        } else {
            System.out.println("\nNo se ha encontrado ningun usuario con este dni\n");
        }
    }

    public void borrarPersona(){
        System.out.println("\nDime dni de usuario a buscar:");
        String dni = lectorTeclado.next();
        if (listaUsuarios.containsKey(dni)){
            listaUsuarios.remove(dni);
            System.out.println("\nUsuario borrado correctamente\n");
        } else {
            System.out.println("\nNo se ha encontrado ningun usuario con este dni\n");
        }
    }

    public void borrarSinDisponibilidad(){
        System.out.println("\nEliminando personas sin disponibilidad...\n");
        String disponibilidad = lectorTeclado.next();

        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.containsKey(disponibilidad)) {
                Object[] usuario = listaUsuarios.get(disponibilidad);
                if (usuario[4] != "S" || usuario[4] != "N") {
                    if (usuario[4] == "S") {

                    } else {
                        listaUsuarios.remove(disponibilidad);
                    }
                }
            }
        }
    }

    public void listarPersonas(){
        if (listaUsuarios.isEmpty()){
            System.out.println("\nNo hay ningun usurario registrado\n");
        } else {
            System.out.println("\nUsuarios registrados:");
            listaUsuarios.forEach((dni,usuario)->{
                System.out.println("Nombre: "+usuario[0]+", Apellido: "+usuario[1]+", Teléfono"+usuario[2]);
            });
        }
    }

    public void mostrarMenu(){
        while (true){

            System.out.println("Menu:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Borrar sin disponibilidad");
            System.out.println("5. Listar personas");
            System.out.println("6. Salir del programa");
            System.out.println("Elige una opción:");

            int opcion = lectorTeclado.nextInt();

            switch (opcion){
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    buscarPersona();
                    break;
                case 3:
                    borrarPersona();
                    break;
                case 4:
                    borrarSinDisponibilidad();
                    break;
                case 5:
                    listarPersonas();
                    break;
                case 6:
                    System.out.println("\nSaliendo del programa...");
                    return;
                default:
                    System.out.println("Algo ha ido mal, prueba otra vez");
            }
        }
    }

}
