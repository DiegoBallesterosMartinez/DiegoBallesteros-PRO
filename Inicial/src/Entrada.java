public class Entrada {

    public static void main(String[]args){
        // OPERADORES ARITMÉTICOS
        System.out.println("OPERADORES ARITMETICOS");
        float operador1 = 10; // para dividir con decimales es necesario que uno de los int sea float
        int operador2 = 5;
        float resultado = operador1 + operador2; // 15 -> int=SinDecimal, float=1decimal
        System.out.println("El resultado de la suma es "+resultado);
        resultado = operador1 - operador2; // 5
        System.out.println("El resultado de la resta es "+resultado);
        resultado = operador1*operador2; // 50
        System.out.println("El resultado de la multiplicación es "+resultado);
        resultado = operador1/operador2; // 2, con float es 1.75
        System.out.println("El resultado de la división es "+resultado);
        resultado = operador1%operador2; // 3.0 -> me da 0 no se por que
        System.out.println("El resultado del resto es "+resultado);
        // ARITMETICOS MONARIOS
        System.out.println("OPERADORES MONARIOS");
        resultado = -resultado; // 3
        System.out.println("El resultado de lo opuesto es "+resultado);
        resultado++; // resultado = resultado + 1
        System.out.println("El resultado del incremento es "+resultado);
        resultado = --resultado; // resultado = resultado - 1
        System.out.print("El resultado del decremento es "+resultado);
        // OPERADORES DE ASIGNACION
        System.out.println("\nOPERADORES DE ASIGNACION");
        operador1 = 10;
        System.out.println(operador1);
        resultado+= operador1; // 11
        System.out.println("El resultado de la suma asignada es "+resultado);
        resultado -=6; // 5
        System.out.println("El resultado de la resta asignada es "+resultado);
        resultado*=3; // 15
        System.out.println("El resultado de la multiplicacion asignada es "+resultado);
        resultado/=2; // 7
        System.out.println("El resultado de la division asignada es "+resultado);
        resultado%=2; // 1
        System.out.println("El resultado del modulo asignada es "+resultado);
        // OPERADORES DE COMPARACION
        System.out.println("OPERADORES DE COMPARACION"); // solo comparan numeros/booleanos
        int n1 = 20;
        int n2=30;
        boolean resultadoComparacion = n1>n2;
        resultadoComparacion= n1<n2; // 20<30
        System.out.println("¿Es menor el 10? "+resultadoComparacion);
        resultadoComparacion= n1>n2; // 20>30
        System.out.println("¿Es Mayor el 10? "+resultadoComparacion);
        resultadoComparacion= n1<=n2; // 20<=30
        System.out.println("¿Es menor o igual el 10? "+resultadoComparacion);
        resultadoComparacion= n1>=n2; // 20>=30
        System.out.println("¿Es Mayor o igual el 10? "+resultadoComparacion);
        resultadoComparacion= n1==n2; // 20==30
        System.out.println("¿Es igual el 10? "+resultadoComparacion);
        resultadoComparacion= n1!=n2; // 20!=30
        System.out.println("¿Es diferente el 10? "+resultadoComparacion);
        //OPERADORES LOGICOS
        System.out.println("OPERADORES LOGICOS"); // |=AltGr+1, &=Shift+6
        n1=30;
        n2=40;
        boolean n3= true;
        int n4=-20;
        boolean resultadoLogico = n1<n2&&n3&&n4<0; // true
        System.out.println("El resultado de las && es "+resultadoLogico); // true&&true&&true =true
        resultadoLogico = n1>0||n2!=n1||n3||n4>0; // true
        System.out.println("El resultado de las || es "+resultadoLogico); // true||true||true||false =true
        boolean resultadoCompuesto = ((n1>n2)&&!n3&&(n4>10))||n4>10||n2>0;
                                    // (F && F && T) || F || T
                                    //  F || F || T
                                    //  T
        System.out.println("Resultado puebra compuesto "+resultadoCompuesto);
        String palabra1 = "hola";
        String palabra2 = "hola";
        boolean resultadoPalabras = palabra1.equals(palabra2); // equals = ==
                                    // si usamos equals.IgnoreCase nos dara true al comparar "Hola" con "hola"
        System.out.println("hola y hola son iguales "+resultadoPalabras);

        n1=4;
        n2=3;
        double resultadoOperacion = (float)n1/n2; // casteamos n1 a float momentaneamente para realizar la operacion
        double n1Double = (double)n1; // esta linea es para que el double se quede de forma permanente
        String n1String = String.valueOf(n1); // Forzar cambio
        String palabra = "12345";
        int numeroPalabra = Integer.parseInt(palabra);
        System.out.println("El resultado de la division es "+resultadoOperacion);




    }

}


