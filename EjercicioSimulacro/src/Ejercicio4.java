public class Ejercicio4 {

    public static void main(String[] args) {
        // Datos fijos
        double precioCoche = 30000;
        int plazos = 6;
        double tasaInteres = 3.5;

        // Pago base por plazo (sin intereses)
        double pagoPorPlazo = precioCoche / plazos;

        // Inicialización del capital restante
        double capitalRestante = precioCoche;

        // Calcular y mostrar el interés para cada mes
        // Mes 1
        double interesMes1 = (capitalRestante * tasaInteres) / 100;
        System.out.printf("El interés pagado (%.1f) en el mes 1 es de %.2f%n", tasaInteres * 1, interesMes1);
        capitalRestante -= pagoPorPlazo;

        // Mes 2
        double interesMes2 = (capitalRestante * tasaInteres * 2) / 100;
        System.out.printf("El interés pagado (%.1f) en el mes 2 es de %.2f%n", tasaInteres * 2, interesMes2);
        capitalRestante -= pagoPorPlazo;

        // Mes 3
        double interesMes3 = (capitalRestante * tasaInteres * 3) / 100;
        System.out.printf("El interés pagado (%.1f) en el mes 3 es de %.2f%n", tasaInteres * 3, interesMes3);
        capitalRestante -= pagoPorPlazo;

        // Mes 4
        double interesMes4 = (capitalRestante * tasaInteres * 4) / 100;
        System.out.printf("El interés pagado (%.1f) en el mes 4 es de %.2f%n", tasaInteres * 4, interesMes4);
        capitalRestante -= pagoPorPlazo;

        // Mes 5
        double interesMes5 = (capitalRestante * tasaInteres * 5) / 100;
        System.out.printf("El interés pagado (%.1f) en el mes 5 es de %.2f%n", tasaInteres * 5, interesMes5);
        capitalRestante -= pagoPorPlazo;

        // Mes 6
        double interesMes6 = (capitalRestante * tasaInteres * 6) / 100;
        System.out.printf("El interés pagado (%.1f) en el mes 6 es de %.2f%n", tasaInteres * 6, interesMes6);
    }
}

