public class Entrada {

    static int edadClase = 50; // Al declarar una variable arriba la podremos llamar desde cualquier lado

    // public=publico static=fijo void=no.devuelve.nada
    // mod_acc mod_adicional mod_ret nombre (argumentos) { cuer
    public static void main (String[]args) {

        System.out.println("Proyecto de variables");
        edadClase = 20; // Cambio el valor a una variable declarada arriba
        valoresMaximos();

        // Variables simples con minuscula (float) - Variables complejas con mayuscula (String)
        // Tipo nombre = valor (el valor es opcional)
        String nombre = "Diego";
        final String CIF =  "B12345"; // No se puede cambiar esta variable

        char letra = 'A';
        Character letraCompleja = 'a';

        short numeroPequeño = 12; // numero pequeño (-255, 255)
        Short pequenioCompleto = 23;
        // pequenioCompleto

        int edad = 21; // numeros sin decimal (-65.435, 65.435)
        Integer edadCompleja = 43;

        // Imprimir edad
        System.out.println("mi edad es "+edad);
        // Cambiando valor edad a partir de esta línea
        edad = 22;
        // Imprimir edad y update
        System.out.println("cambiando edad");
        System.out.println("Mi edad es "+edad);
        long telefono = 123456789; // numeros muy grandes
        Long telefonoComplejo = 123456789123456789L;

        float altura = 3.14f; // numero con decimales (siempre escribir f de float)
        Float alturaCompleja = 3.123123F;
        double decimalesDetalle = 3.1415163456; // numero con muchos decimales
        Double decimalCompleja = 3.123123123123;
        boolean carne = true; // false
        Boolean carneCompleja = false;

    }
    // Este nuevo metodo no se ejecuta a no ser que le llame desde main
    // Las variables que van por bloque se pueden volver a crear ya que están en distintos bloques/metodos
    public static void miMetodo(){
        String nombre = "Rubén";
        int edad = 18;
    }
    public static void otroMetodo(){
        int edadClase = 90;
        // this.edadClase = 90;
    }
    public static void valoresMaximos(){
        System.out.println("Imprimiendo los valores maximos y minimos de los tipos");
       //Ejercio en otra ventana nombre: EjercicioMaximos

    }

}
