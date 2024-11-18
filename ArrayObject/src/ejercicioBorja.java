import java.util.Scanner;

public class ejercicioBorja {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        //definir un array con filas 5 y columnas aleatorias entre 2 y 6
        // rellenar el array (entero) con aleatorios

        // numero filas es 5
        int numeros[][] = new int[5][];
        // numero aleatorios en columna
        for (int i = 0; i < numeros.length; i++) {
            int columnasAleatorias = (int) (Math.random() * 5) + 2;
            numeros[i] = new int[columnasAleatorias];
        }
        // rellenar el array con enteros aleatorios
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 101);
            }

        }
        imprimirArray(numeros);
        /*
        1,3,4,6
        2,3,5,7
        6,7,6,7
        4,1,2,3
         */
        // al array que obtuviste restale uno a cada posicion y vuelve a imprimir
        /*
        0,2,3,5
        1,2,4,6
        5,6,5,6
        3,0,1,2
         */

        System.out.println("Imprimiendo modificacion:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] -= 1;
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        //modificar e imprimir el array 8 veces, donde el usuario cada vez elige cuantas unidades se quitan
        for (int x = 0; x < 8; x++) {
            System.out.println("Dime un numero para modificar");
            int modificador = lectorTeclado.nextInt();
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    numeros[i][j] += modificador;
                    System.out.print(numeros[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void imprimirArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }


    }

}

