/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombre = "";
        String apellido = "";
        String cadena = "";
        String tipo_empleado = "";
        String valor_usuario = "";
        int edad = 0;
        int bono_hijos = 1;
        int hijos = 0;
        int total_bono_hijos = 0;
        double sueldo_mensual = 0;
        double incentivo = 0;
        double total_pagar = 0;
        double total_incentivo = 0;
        double sueldo_total = 0;
        double descuentoss = 0;
        double total_descuentoss = 0;
        double total_empresa = 0;
        boolean bandera = true;

        cadena = String.format("%s%s\n", cadena,
                "\n\n ==========REPARTO DE ROL DE PAGOS POR EMPLEADO----\n\n");

        do {
            System.out.println("Ingrese sus nombres");
            nombre = entrada.nextLine();

            System.out.println("Ingrese sus apellidos");
            apellido = entrada.nextLine();

            System.out.println("Ingrese el tipo de empleado");
            tipo_empleado = entrada.nextLine();

            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            
            entrada.nextLine();

            System.out.println("Ingrese el número de hijos");
            hijos = entrada.nextInt();
            
            

            if (tipo_empleado.equals("tipo 1")
                    || tipo_empleado.equals(" Tipo 1")) {

                sueldo_mensual = 340;
                incentivo = (sueldo_mensual * 5) / 100;
                bono_hijos = hijos * 10;
                sueldo_total = sueldo_mensual + bono_hijos + incentivo;
            } else {
                if (tipo_empleado.equals("tipo 2")
                        || tipo_empleado.equals(" Tipo 2")) {

                    sueldo_mensual = 460;
                    incentivo = sueldo_mensual * 10 / 100;
                    bono_hijos = hijos * 10;
                    sueldo_total = sueldo_mensual + bono_hijos + incentivo;
                } else {
                    if (tipo_empleado.equals("tipo 3")
                            || tipo_empleado.equals(" Tipo 3")) {

                        sueldo_mensual = 580;
                        incentivo = sueldo_mensual * 15 / 100;
                        bono_hijos = hijos * 10;
                        sueldo_total = sueldo_mensual + bono_hijos + incentivo;
                    } else {
                        if (tipo_empleado.equals("tipo 4")
                                || tipo_empleado.equals(" Tipo 4")) {

                            sueldo_mensual = 600;
                            incentivo = sueldo_mensual * 15 / 100;
                            bono_hijos = hijos * 10;
                            sueldo_total = sueldo_mensual + bono_hijos + incentivo;
                        }
                    }
                }

            }

            if (edad <= 20) {
                descuentoss = sueldo_total - 15; 
            } else {
                if ((edad > 20) && (edad <= 30)) {
                    descuentoss = sueldo_total - 25; 
                } else {
                    if (edad > 31) {
                        descuentoss = sueldo_total - 35; 
                    }
                }
            }
            total_pagar = descuentoss + sueldo_total;

            cadena = String.format("%s Nombre: %s%s, (%d años)\n\t "
                    + "Sueldo mensual: %.2f$\n\t Incentivo-1: %.2f$\n\t "
                    + "Hijos: %d\n\t Descuento SS: %.2f$\n\t"
                    + "Total a pagar: %2f$\n\n ",
                    cadena, nombre, apellido, edad, sueldo_mensual, incentivo,
                    hijos, descuentoss, total_pagar);
            entrada.nextLine();

            total_descuentoss = total_descuentoss + descuentoss;
            total_incentivo = total_incentivo + incentivo;
            total_bono_hijos = total_bono_hijos + bono_hijos;
            total_empresa = total_empresa + total_pagar;
            System.out.println("Desea ingresar más datos? (S/N)");
            valor_usuario = entrada.nextLine();

            if (valor_usuario.equals("N") || valor_usuario.equals("n")) {
                bandera = false;
            }

        } while (bandera == true);

        cadena = String.format("%s%s\n", cadena,
                "\n\n===REPORTE DE ROL DE PAGOS DE LA EMPRESA (TOTALES)====\n");

        cadena = String.format("%s Descuento seguro social = %.2f$\n"
                + "Total Incentivo = %.2f$\n Pago por Hijos = %d$\n"
                + "Total pago de la empresa = %.2f$\n",
                cadena, total_descuentoss, total_incentivo, total_bono_hijos,
                total_empresa);
        System.out.printf("%s", cadena);
    }
}
