public class Entrada {
    public static void main(String[] args) {

        int[] numeros = new int[4];
        // 0, 0, 0, 0
        System.out.println(numeros.length);
        // numero asignado de huecos, 4
        numeros[3] = 7;
        // 0, 0, 7, 0
        System.out.println(numeros[3]);
        // imprimir el numero 3, actualmente 7
        String[] palabras = {"Hola", "que", "tal", "estas"};
        System.out.println("la palabra en la ultima posicion es " + palabras.length);


        //Sacar todas las palabras del array
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("la palabra es: " + palabras[i]);
        }

        //rellenar el array con numeros aleatorios hasta 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
            System.out.println(numeros[i]);
        }

        // sacar solo posiciones pares
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
            // sacar numeros pares
            if (numeros[i] % 2 == 0) {
            }
            System.out.println(numeros[i]);
        }

        for (int item : numeros) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }

    }
}
