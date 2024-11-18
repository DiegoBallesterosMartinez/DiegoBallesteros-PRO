public class EntradaMultidimensional {
    public static void main(String[] args) {

        int[][] numeros ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16,17}};

        // cuantas filas tengo?
        int numeroFilas = numeros.length; // 4
        // columnas primera fila
        int columnasFila1 = numeros[0].length;
        int columnasFila2 = numeros[1].length;
        int columnasFila3 = numeros[2].length;
        int columnasFila4 = numeros[3].length;

        // sacar el ultimo elemento
        // numeros[3][4]                (fila)        (columna)  =length del length
        int ultimoNumero = numeros[numeros.length-1][numeros[numeros.length-1].length-1];

        int primerValor = numeros[0][0];
        // modificar valor de una posicion
        numeros[0][0] = 0;

        // acceder a todos los elemntos
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]+"\t");
            }
            System.out.println();
        }
        // acceder a todos los elementos
        for (int[] item:numeros){
            for (int element: item){
                System.out.println(element+"\t");
            }
        }

    }
}
