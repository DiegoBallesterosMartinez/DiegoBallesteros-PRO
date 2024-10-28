import java.util.Scanner;

public class PruebaEjercicio4 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Escribe una palabra sin acentos");
        String palabra = lectorTeclado.nextLine();

        if (palabra.length()<4){
            String resultado = palabra.toUpperCase();
            System.out.println("Resultado: "+resultado);
        } else if (palabra.length()>4&&palabra.length()<8){
            String resultado = palabra.toLowerCase();
            System.out.println("Resultado: "+resultado);
        } else if (palabra.length()>8&&palabra.length()<11){
            String resultado = palabra.replace('a', 'á')
                    .replace('e', 'é')
                    .replace('i', 'í')
                    .replace('o', 'ó')
                    .replace('u', 'ú')
                    .replace('A', 'Á')
                    .replace('E', 'É')
                    .replace('I', 'Í')
                    .replace('O', 'Ó')
                    .replace('U', 'Ú');
            System.out.println("Resultado: "+resultado);
        } else {
            String resultado = new StringBuilder(palabra).reverse().toString();
            System.out.println("Resultado: "+resultado);

        }

    }
}
