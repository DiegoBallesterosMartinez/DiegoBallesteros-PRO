public class EjercicioMaximos {



    // Ejercicio: El tipo byte tiene un Max de ... y un minimo de ... -> con short, int, long, double, float
    public static void main(String[]args){



        System.out.println("Vamos a mostrar los MIN y MAX de cada tipo");
        valoresMaximos();
        System.out.println("Terminando la ejecucion....");

    }

    public static void valoresMaximos(){
        //short, int, long, double, float
        int minimo = Integer.MIN_VALUE;
        int maximo = Integer.MAX_VALUE;



        System.out.println("El valor minimo del byte es "+Byte.MIN_VALUE +"y el maximo es "+Byte.MAX_VALUE);
        System.out.printf("El valor minimo del byte es %d y el maximo es %d\n",Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.println("El valor minimo del Short es "+Byte.MIN_VALUE +"y el maximo es "+Byte.MAX_VALUE);
        System.out.printf("El valor minimo del Short es %d y el maximo es %d\n",Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.println("El valor minimo del Integer es "+Byte.MIN_VALUE +"y el maximo es "+Byte.MAX_VALUE);
        System.out.printf("El valor minimo del Integer es %d y el maximo es %d\n",Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println("El valor minimo del double es "+Byte.MIN_VALUE +"y el maximo es "+Byte.MAX_VALUE);
        System.out.printf("El valor minimo del double es %.5f y el maximo es %.5f\n",Double.MIN_VALUE, Double.MAX_VALUE);

        System.out.println("El valor minimo del long es "+Byte.MIN_VALUE +"y el maximo es "+Byte.MAX_VALUE);
        System.out.printf("El valor minimo del long es %d y el maximo es %d\n",Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println("El valor minimo del float es "+Byte.MIN_VALUE +"y el maximo es "+Byte.MAX_VALUE);
        System.out.printf("El valor minimo del float es %2f y el maximo es %2f\n",Float.MIN_VALUE, Float.MAX_VALUE);




    }


}
