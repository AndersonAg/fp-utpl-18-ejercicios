
package taller1;

import java.util.Scanner;

/**
 *
 * @author Anderson Aguirre
 */
public class ejercicio1 {

    public static void main(String[] args) {
                int dganado;
                int hijos;
                int pasaje;
                int bar;
                int salir;
                int spasaje = 0;
                int sbar = 0;
                int ssalida = 0;
                int total ;
                 String cadena = String.format("%s\t%s\t%s\t%s\n", "HIJOS", "PASAJES", "BAR", "SALIDAS");
            Scanner entrada = new Scanner(System.in);

             System.out.println("ingrese el valor semanal que gana usted en dolares:");
            dganado = entrada.nextInt();
            System.out.println("ingrese el numero de sus hijos:");
            hijos = entrada.nextInt();
            for (int contador = 1; contador <= hijos; contador ++){
                
            System.out.printf("ingrese el valor semanal que destina en su hijo  %d para pasajes: \n", contador);
             pasaje = entrada.nextInt();
             spasaje = spasaje + pasaje;
              System.out.printf("ingrese el valor semanal que destina en su hijo %d para el bar: \n", contador);
             bar = entrada.nextInt();
             sbar=sbar+bar;
              System.out.printf("ingrese el valor semanal que destina en su hijo %d para salidas: \n", contador);
             salir = entrada.nextInt();
             ssalida = ssalida + salir;
                         cadena = String.format("%sHIJO:%d\t%d\t%d\t%d\n", cadena,contador , pasaje, bar, salir);

            }
                    System.out.printf("%s", cadena);

            total = spasaje + sbar + ssalida;
            if (total < dganado){
            System.out.printf("Le sobra dinero");
            }else{
                if (total > dganado){
                        System.out.printf("Le falta dinero");
                }
                else{
                    System.out.printf("Le abastece totalmente su dinero");

                }
            }   
            
    }
    
}
