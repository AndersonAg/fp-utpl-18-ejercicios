package taller1;

import java.util.Scanner;

/**
 *
 * @author Anderson Aguirre
 */
public class ejercicio2 {

    public static void main(String[] args) {
        String nombre=null;
        int dganado = 0;
        int hijos;
        int pasaje;
        int bar;
        int salir;
        int spasaje = 0;
        int sbar = 0;
        int ssalida = 0;
        int total;
        int pfamilia;
        String cadena = String.format("%s\t%s\t%s\t%s\n", "HIJOS", "PASAJES", "BAR", "SALIDAS");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el numero de padres de familia a evaluar:");
        pfamilia = entrada.nextInt();
        entrada.nextLine();
        for (int contadorA = 1; contadorA <= pfamilia; contadorA++) {
            entrada.nextLine();
            System.out.println("ingrese el nombre del padre de familia:");
            nombre = entrada.nextLine();
            System.out.println("ingrese el valor semanal que gana usted en dolares:");
            dganado = entrada.nextInt();
            System.out.println("ingrese el numero de sus hijos:");
            hijos = entrada.nextInt();
            for (int contador = 1; contador <= hijos; contador++) {

                System.out.printf("ingrese el valor semanal que destina en su hijo  %d para pasajes: \n", contador);
                pasaje = entrada.nextInt();
                spasaje = spasaje + pasaje;
                System.out.printf("ingrese el valor semanal que destina en su hijo %d para el bar: \n", contador);
                bar = entrada.nextInt();
                sbar = sbar + bar;
                System.out.printf("ingrese el valor semanal que destina en su hijo %d para salidas: \n", contador);
                salir = entrada.nextInt();
                ssalida = ssalida + salir;
                cadena = String.format("%sHIJO:%d\t%d\t%d\t%d\n", cadena, contador, pasaje, bar, salir);

            }
        }
        System.out.printf("%s", cadena);

        total = spasaje + sbar + ssalida;
        if (total < dganado) {
            System.out.printf("Al padre de Familia %s Le sobra dinero", nombre);
        } else {
            if (total > dganado) {
                System.out.printf("Al padre de Familia %s Le falta dinero", nombre);
            } else {
                System.out.printf("Al padre de familia %s Le abastece totalmente su dinero", nombre);

            }
        }

    }

}
