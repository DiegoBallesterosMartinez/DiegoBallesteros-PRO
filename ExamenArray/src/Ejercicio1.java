public class Ejercicio1 {
    public static void main(String[] args) {


        // EJERCICIOS FÁCILES 1-4


        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 17);
            for (int item:array){
                if (array[i]==item){
                    array[i]=(int)(Math.random()*17);
                }
            }
        }
        // Mostrar elementos sin ordenar
        System.out.println("Elementos sin ordenar:");
        for (int item : array) {

            System.out.println(item);
        }
        // Mostrar elementos ordenados de mayor a menor
        System.out.println("Elementos ordenados de mayor a menor:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int item:array){
            System.out.println(item);
        }
        // Mostrar elementos en posiciones pares
        System.out.println("Elementos en posicion par:");
        for (int i = 0; i < array.length; i++) {
            if (i%2==0){
                System.out.println(array[i]);
            }
        }
        // Mostrar elementos pares
        System.out.println("Elementos pares");
        for (int i = 1; i < array.length; i++) {
            if (array[i]%2==0) {
                System.out.println(array[i]);
            }
        }
    }
}
