import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    private Scanner lectorTeclado;
    private ArrayList<String> listaAlumnos;
    private ArrayList<Integer> notaAlumnos;

    // constructor
    public Ejercicio2(Scanner lectorTeclado) {
        this.lectorTeclado = lectorTeclado;
        listaAlumnos = new ArrayList<>();
        notaAlumnos = new ArrayList<>();
    }

    public void agregarAlumnos() {
        System.out.println("numero de alumnos de la clase");
        int numAlumnos = lectorTeclado.nextInt();

        // añadir nombres
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Dime nombre del alumno " + i+1);
            String nombre = lectorTeclado.next();
            listaAlumnos.add(nombre);
        }

        // pregunta para calificar
        System.out.println("Quieres empezar a calificar? (S/N)");
        String respuesta = lectorTeclado.next();
        if (respuesta == "S") {
            calificar();
        } else if (respuesta == "N") {

        } else {
            System.out.println("Respuesta invalida, pruebe otra vez");
        }
    }

    public void calificar() {
        if (!listaAlumnos.isEmpty()) {
            // nota random
            for (int i = 0; i < listaAlumnos.size(); i++) {
                listaAlumnos.get(i);
                int notaRandom = (int) (Math.random() * 11);
                notaAlumnos.add(notaRandom);
            }

            System.out.println("a. ver suspensos");
            System.out.println("b. ver calificaciones");
            String opcion = lectorTeclado.next();

            if (opcion == "a") {
                for (int i = 0; i < listaAlumnos.size(); i++) {
                    if (notaAlumnos.get(i) < 5) {
                        System.out.println("Alumno: " + listaAlumnos.get(i) + " Nota: " + notaAlumnos.get(i));
                    }
                }
            } else if (opcion == "b") {
                for (int i = 0; i < listaAlumnos.size(); i++) {
                    if (notaAlumnos.get(i) < notaAlumnos.get(i + 1)) {
                        // datos temporales
                        int tempNota = notaAlumnos.get(i);
                        String tempNombre = listaAlumnos.get(i);

                        // si i es menor a i+1 entonces i = i+1
                        //      notaAlumnos.get(i)=listaAlumnos.get(i+1);
                        //      listaAlumnos.get(i)=listaAlumnos.get(i+1);

                        // recuperar temp
                        //      notaAlumnos.get(i+1)=tempNota;
                        //      listaAlumnos.get(i+1)=tempNombre;
                    }
                    System.out.println("Imprimiendo calificaciones");
                    System.out.println("Alumno: " + listaAlumnos.get(i) + " Nota: " + notaAlumnos.get(i));

                }
            } else {
                System.out.println("respuesta invalida");
            }

        } else {
            System.out.println("No hay alumnos registrados en la clase");
        }
    }
}
