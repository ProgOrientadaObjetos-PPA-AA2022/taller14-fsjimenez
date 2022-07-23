/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

/*Por cada trabajador ingresar: cédula, nombres, correo, sueldo, mes del sueldo.*/
/**
 *
 * @author Usuario iTC
 */
public class Trabajador {

    private int cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mes;

    public Trabajador(int c, String n, String corr, double s, String m) {
        cedula = c;
        nombres = n;
        correo = corr;
        sueldo = s;
        mes = m;
    }
    
    public Trabajador(){
    }

    public void establecerNombres(String nom) {
        nombres = nom;
    }

    public void establecerCedula(int ced) {
        cedula = ced;
    }

    public void establecerCorreo(String corr) {
        correo = corr;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public void establecerMes(String m) {
        mes = m;
    }
    
    public int obtenerCedula(){
        return cedula;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public String obtenerMes(){
        return mes;
    }
    
}
