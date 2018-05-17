package taller1;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class paul {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hijos;
        String nombre;
        String gastos;
        String gastost;
        String txt;
        int nhijos;
        int reporte;
        double sueldo;
        double pasaje;
        double bar;
        double salir;
        double tpasaje = 0;
        double tbar = 0;
        double tsalida = 0;
        double gastot;

        gastost = "Reportes Finales de los Padres de Familia";
        System.out.println("ingrese el numero de padres de familia a evaluar:");
        reporte = entrada.nextInt();

        for (int a = 0; a < reporte; a++) {
            tpasaje = 0;
            tbar = 0;
            tsalida = 0;
            entrada.nextLine();
            System.out.println("Ingrese el nombre del padre: ");
            nombre = entrada.nextLine();
            System.out.printf("Ingrese el numero de hijos: ");
            nhijos = entrada.nextInt();
            System.out.printf("Ingrese el sueldo semanal: ");
            sueldo = entrada.nextDouble();
            gastos = String.format("Nombre de Padre: %s\nSueldo Semanal: %.2f\nNúmero de Hijos: %d", nombre, sueldo, nhijos);
            gastos = String.format("\nGastos Semanales de los Hijos:\n%-20s%-20s%-20s%-20s\n", "Persona", "Pasaje", "Bar", "Salida");
            for (int i = 1; i <= nhijos; i++) {
                hijos = String.format("Hijo %d", i);
                System.out.printf("Datos del %s\n", hijos);
                System.out.printf("pasaje: ");
                pasaje = entrada.nextDouble();
                System.out.printf("bar: ");
                bar = entrada.nextDouble();
                System.out.printf("salidas: ");
                salir = entrada.nextDouble();

                gastos = String.format("%s%-20s%-20.2f%-20.2f%-20.2f\n", gastos, hijos, pasaje, bar, salir);
                tpasaje = tpasaje + pasaje;
                tbar = tbar + bar;
                tsalida = tsalida + salir;
            }
            gastos = String.format("%s\n%-20s%-20.2f%-20.2f%-20.2f\n", gastos, "Total gastos: ", tpasaje, tbar, tsalida);

            gastot = tpasaje + tbar + tsalida;

            if (gastot > sueldo) {
                txt = "falta";
            } else if (gastot == sueldo) {
                txt = "alcanza";
            } else {
                txt = "sobra";
            }
            gastos = String.format("%sEl padre de familia %s le %s el dinero.\n", gastos, nombre, txt);
            gastost = String.format("%s\n%s", gastost, gastos);
        }
        System.out.println(gastost);
    }

}
