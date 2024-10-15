import java.util.Scanner;

public class EjercicioDos {

    // Metodo main
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        // Leer datos del primer participante
        System.out.print("Ingresa el nombre del primer participante: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingresa el número de jugadores del primer participante: ");
        int jugadores1 = scanner.nextInt();

        System.out.print("Ingresa el presupuesto del primer participante: ");
        double presupuesto1 = scanner.nextDouble();

        // Limpiar el buffer
        scanner.nextLine();

        // Leer datos del segundo participante
        System.out.print("Ingresa el nombre del segundo participante: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Ingresa el número de jugadores del segundo participante: ");
        int jugadores2 = scanner.nextInt();

        System.out.print("Ingresa el presupuesto del segundo participante: ");
        double presupuesto2 = scanner.nextDouble();

        // Limpiar el buffer
        scanner.nextLine();

        // Leer datos del tercer participante
        System.out.print("Ingresa el nombre del tercer participante: ");
        String nombre3 = scanner.nextLine();

        System.out.print("Ingresa el número de jugadores del tercer participante: ");
        int jugadores3 = scanner.nextInt();

        System.out.print("Ingresa el presupuesto del tercer participante: ");
        double presupuesto3 = scanner.nextDouble();

        // Validaciones
        // 1. El primer participante tiene 11 jugadores
        boolean primerParticipanteTiene11 = (jugadores1 == 11);
        System.out.println("1. El primer participante tiene 11 jugadores: " + primerParticipanteTiene11);

        // 2. El segundo participante tiene jugadores pares
        boolean segundoParticipanteJugadoresPares = (jugadores2 % 2 == 0);
        System.out.println("2. El segundo participante tiene jugadores pares: " + segundoParticipanteJugadoresPares);

        // 3. El tercer participante tiene presupuesto positivo
        boolean tercerParticipantePresupuestoPositivo = (presupuesto3 > 0);
        System.out.println("3. El tercer participante tiene presupuesto positivo: " + tercerParticipantePresupuestoPositivo);

        // 4. La liga está preparada para empezar
        boolean ligaPreparada = (jugadores1 == 11 && jugadores2 == 11 && jugadores3 == 11 &&
                presupuesto1 > 0 && presupuesto2 > 0 && presupuesto3 > 0);
        System.out.println("4. La liga está preparada para empezar: " + ligaPreparada);
    }
}
