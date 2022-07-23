/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.Scanner;

/*
Generar un programa que permita ingresar por teclado información que corresponde 
a sueldos de trabajadores. Por cada trabajador ingresar: cédula, nombres, correo, sueldo, mes del sueldo.
La información debe quedar registrada en un base de datos.

El proceso de ingreso es iterativo hasta que el usuario decida lo contrario.
*/

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Enlace c = new Enlace();

        //c.insertarAuto(a);

        String nombres, correo, mes, seguir;
        double sueldo;
        int cedula;

        do {
            System.out.println("Ingrese su cedula");
            cedula = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese sus nombres");
            nombres = entrada.nextLine();
            System.out.println("Ingrese su correo");
            correo = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador");
            sueldo = entrada.nextDouble();
            System.out.println("Ingrese el mes del sueldo");
            mes = entrada.nextLine();
            
            Trabajador t = new Trabajador(cedula, nombres, correo, sueldo, mes);
            
            c.insertarTrabajador(t);

            entrada.nextLine();
            System.out.println("Ingrese si para seguir introduciendo datos");
            seguir = entrada.nextLine();
        } while (seguir.equals("si"));
    }
    
}
