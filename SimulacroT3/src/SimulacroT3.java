import java.util.Scanner;

public class SimulacroT3 {
    public static void main(String[] args) {

        // llamada de ejercicios:
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();

        // cierre de main
    }

    public static void ejercicio1() {
        Scanner lectorTeclado = new Scanner(System.in);

        int numero = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contador = 0;
        int contadorPares= 0;
        int contadorImpares = 0;
        int contadorCeros = 0;

        while (true){
            System.out.println("Introduce un numero(negativo se acaba)");
            numero = lectorTeclado.nextInt();
            if (numero < 0){
                break;
            }
            contador++;
            if (numero==0){
            contadorCeros++;
            } else if (numero %2 == 0){
                contadorPares++;
                sumaPares += numero;
              // con else sumaImpares++ se reduce
            } else if (numero %2 == 0){
                contadorImpares++;
                sumaImpares += numero;
            }
        }
        int opcion = 0;
        do {
            System.out.println("\nBienvenido a programa de Diego");
            System.out.println("1-Suma de los números pares introducidos.");
            System.out.println("2-Media de los números pares introducidos con dos decimales.");
            System.out.println("3-Media de los números impares introducidos con dos decimales.");
            System.out.println("4-Cuántos números hemos introducido.");
            System.out.println("5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares\n" + "y cuantos impares.");
            System.out.println("6. Salir.");
            System.out.println("Elige una opcion:");

            switch (opcion){
                case 1:
                    System.out.println("La suma de los pares es: "+sumaPares);
                    break;
                case 2:
                    double mediaPares = (double)sumaPares / contadorPares;
                    System.out.printf("La media de los pares es: %2f", mediaPares);
                    break;
                case 3:
                    double mediaImpares = (double)sumaImpares / contadorImpares;
                    System.out.printf("La media de los pares es: %2f", mediaImpares);
                    break;
                case 4:
                    System.out.println("Se han introducido "+contador+" numeros");
                    break;
                case 5:
                    System.out.println("Se han introducido los siguientes numeros:\nPares: "+contadorPares+"\nImpares: "+contadorImpares+"\nCeros: "+contadorCeros);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida, pruebe de nuevo");
            }

        } while (opcion !=6);
    }



    public static void ejercicio2(){
        Scanner lectorTeclado = new Scanner(System.in);
        // Realizar un programa que pida las 20 notas de todos los alumnos de una clase. Al finalizar,
        //imprimir por pantalla si hay algún suspenso y la nota media de todos los alumnos.


        int numeroAlumnos = 20;
        int sumaNotas = 0;
        boolean suspenso = false;

        for (int i = 1; i < numeroAlumnos; i++) {
            System.out.println("Introduce la nota del alumno");
            int nota = lectorTeclado.nextInt();

            while (nota < 0 || nota > 10) {
                System.out.println("La nota no es valida, introduce una valida");
                nota = lectorTeclado.nextInt();
            }

            sumaNotas += nota;
            if (nota < 5) {
                suspenso = true;
            }
            double mediaNotas = (double) sumaNotas / numeroAlumnos;
            if (suspenso) {
                System.out.println("Hay suspensos");
            } else {
                System.out.println("No hay suspensos");
            }
            System.out.println("La media de las notas es: "+mediaNotas);

        }
    }


    public static void ejercicio3(){
        Scanner lectorTeclado = new Scanner(System.in);

    double saldo = 0;
    final int PinCorrecto = 1111;
    int opcion = 0;
        do {
         System.out.println("Bienvenido al cajero automatico");
         System.out.println("1. Ingresar dinero");
         System.out.println("2. Sacar dinero");
         System.out.println("3. Consultar estado de la cuenta");
         System.out.println("4. Salir");
         System.out.println("Elige una opcion:");

          switch (opcion){
             case 1:
                System.out.println("Introduce tu PIN");
                int try1 = lectorTeclado.nextInt();
                if (try1==PinCorrecto){
                    System.out.println("Introduce cantidad a ingresar");
                    double ingreso = lectorTeclado.nextDouble();
                    System.out.println("Saldo introducido con exito");
                } else {
                    System.out.println("PIN incorrecto");
                }
                break;
             case 2:
                System.out.println("Introduce tu PIN");
                int try2 = lectorTeclado.nextInt();
                if (try2==PinCorrecto){
                    System.out.println("Introduce cantidad a retirar");
                    double retirada = lectorTeclado.nextDouble();
                    if (saldo>retirada){
                        System.out.println("Saldo retirado con exito");
                    } else {
                        System.out.println("Imposible sacar dinero");
                    }

                } else {
                    System.out.println("PIN incorrecto");
                }
                break;
             case 3:
                System.out.println("Introduce tu PIN");
                int try3 = lectorTeclado.nextInt();
                if (try3==PinCorrecto){
                    System.out.println("Su saldo es de: "+saldo);
                } else {
                    System.out.println("PIN incorrecto");
                }
                break;
             case 4:
                System.out.println("Introduce tu PIN");
                int try4 = lectorTeclado.nextInt();
                if (try4==PinCorrecto){
                    System.out.println("Cerrando sesion de la cuenta...");
                    break;
                } else {
                    System.out.println("PIN incorrecto");
                    break;
                }
            }

        } while (opcion!=4);
    }
    
    public static void ejercicio4(){
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Dime una palabra(sin acentos)");
        String palabra = lectorTeclado.nextLine();
        if (palabra.length()<4){
            String resultado =  palabra.toUpperCase();
            System.out.println("Resultado:"+resultado);
        } else if (palabra.length()>4&&palabra.length()<8){
            String resultado = palabra.toLowerCase();
            System.out.println("Resultado: "+resultado);
        } else if (palabra.length()>8&&palabra.length()<11){
            String resultado = palabra.replace('a','á').replace('e','é')
                                      .replace('i','í').replace('o','ó')
                                      .replace('u','ú');
            System.out.println("Resultado: "+resultado);
        }else {
            for (int i = palabra.length() - 1; i >= 0; i--) {
                System.out.print(palabra.charAt(i));
            }
        }
    }
}



















