import java.net.SocketOption;
import java.util.Scanner;

public class Ejercicios {


    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio1b();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();

    }

    public static void ejercicio1(){
    // Realizo ejercicio1

    // Diego ballesteros Martinez
    // C/ Islas cies nº5, 5A
    // 28924 Madrid
    // España

    final String NOMBRECOMPLETO = "Diego Ballesteros Martinez";
    final String CALLE = "Islas Cies";
    int NUMEROPORTAL = 5;
    int NUMEROPISO = 5;
    final String LETRA = "A";
    int CODIGOPOSTAL = 28924;
    final String LOCALIDAD = "Alcorcon";
    final String MUNICIPIO = "Madrid";
    final String PAIS = "España";

    System.out.println(NOMBRECOMPLETO);
    System.out.println(CALLE + " nº"+NUMEROPORTAL+", "+NUMEROPISO+LETRA);
    System.out.println(CODIGOPOSTAL+" "+MUNICIPIO);
    System.out.println(PAIS);

    }

    public static void ejercicio1b() {
        // Otra forma de resolver ejercicio1

        final String NOMBRECOMPLETO = "Diego Ballesteros Martinez";
        final String CALLE = "Islas Cies";
        final int NUMEROPORTAL = 5;
        final int NUMEROPISO = 5;
        final char LETRA = 'A';
        final int CODIGOPOSTAL = 28924;
        final String LOCALIDAD = "Alcorcon";
        final String MUNICIPIO = "Madrid";
        final String PAIS = "España";

        System.out.println(NOMBRECOMPLETO);
        System.out.printf("%s nº%d %d%c\n",CALLE,NUMEROPORTAL,NUMEROPISO,LETRA);
        System.out.printf("%d, %s %s\n",CODIGOPOSTAL,LOCALIDAD,MUNICIPIO);
        System.out.println(PAIS);
    }

    public static void ejercicio2(){

        Scanner lectorTeclado = new Scanner(System.in);

        String nombre;
        Integer ano;

        System.out.println("Nombre");
        nombre = lectorTeclado.next();
        System.out.println("Cuanto anos tienes");
        ano = lectorTeclado.nextInt();


        System.out.println("Te llamas " +nombre +"\ntienes " +ano+" anos");
        System.out.println("Pulsa enter para continuar...");
        // Te llamas *** \n Tienes *** años \n Pulsa enter para continuar...

    }

    public static void ejercicio3(){

        // Scanner para leer teclado
        Scanner lectorTeclado = new Scanner(System.in);

        // Leer dos numeros enteros
        System.out.print("Ingrese el primer numero entero: ");
        int n1 = lectorTeclado.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int n2 = lectorTeclado.nextInt();

        // Realizar operaciones
        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        int divisionEntera = n1/n2;
        int resto = n1%n2;
        double divisionReal = (double)n1/n2;
        double restoReal = n1%(double)n2;

        // Resultado operaciones
        System.out.println("Resultado de las operaciones:");
        System.out.println("a) Suma"+suma);
        System.out.println("b) Resta"+resta);
        System.out.println("c) Multiplicacion"+multiplicacion);
        System.out.println("d) Division Entera"+divisionEntera);
        System.out.println("e) Resto"+resto);
        System.out.println("f) Division Real"+divisionReal);
        System.out.println("g) Resto Real"+restoReal);

    }

    public static void ejercicio4(){

        // Scanner para leer teclado
        Scanner lectorTeclado = new Scanner(System.in);

        // Precio comidas
        final double precioBebida = 1.25;
        final double precioBocadillos = 2.05;

        // Preguntar que han pedido
        System.out.println("Numero de bebidas: ");
        int numeroBebidas = lectorTeclado.nextInt();
        System.out.println("Numero de bocadillos: ");
        int numeroBocadillos = lectorTeclado.nextInt();

        // Calcular cuenta
        double costeBebidas = numeroBebidas * precioBebida;
        double costeBocadillos = numeroBocadillos * precioBocadillos;
        double costeTotal = costeBebidas + costeBocadillos;

        // Mostrar cuenta
        System.out.println("Coste de las bebidas: " + costeBebidas);
        System.out.println("Coste de los bocadillos: " + costeBocadillos);
        System.out.println("Coste consumición: " + costeTotal);

    }

    public static void ejercicio5(){

        // Establecer lector teclado
        Scanner lectorTeclado = new Scanner(System.in);
        // Pedir numero de segundos
        System.out.println("Número de Segundos");
        int totalSegundos=lectorTeclado.nextInt();
        // Calculo de h/min/seg
        int horas = totalSegundos/3600;
        int minutos = (totalSegundos%3600)/60;
        int segundos = totalSegundos%60;
        // Imprimir Resultados
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);
        // 24973seg = 6h 56min 13sec

    }

    public static void ejercicio6(){

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("¿Cuanto te ha costado el articulo?");
        float precioArticulo = lectorTeclado.nextFloat();
        System.out.println("¿Cuanto IVA has pagado?");
        int iva = lectorTeclado.nextInt();
        //400 -> 400 - (400*21%)
        float ivaPagado = precioArticulo * ((float) iva/100);
        float precioNeto = precioArticulo - ivaPagado;
        System.out.println("IVA: "+ivaPagado);
        System.out.println("Producto sin IVA: "+precioNeto);


    }

    public static void ejercicio7(){

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Escribe un radio entero: ");
        int radio = lectorTeclado.nextInt();
        //double longitud = valor * (Math.PI * 2);
        double longitud = 2 * Math.PI * radio;
        System.out.println("Longitud de la circunferencia: "+longitud);
        //double area = Math.PI * valor * 2;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Area de circulo: "+area);d

    }

}
