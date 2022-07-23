/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

/**
 *
 * @author Usuario iTC
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public void establecerNombre(String nom) {
        nombre = nom;
    }
    
    public void establecerApellido(String ape) {
        apellido = ape;
    }
    
    public void establecerCalificacion1(double c1) {
        calificacion1 = c1;
    }
    
    public void establecerCalificacion2(double c2) {
        calificacion2 = c2;
    }
    
    public void establecerCalificacion3(double c3) {
        calificacion3 = c3;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerCalificacion1(){
        return calificacion1;
    }
    
     public double obtenerCalificacion2(){
        return calificacion2;
    }
     
    public double obtenerCalificacion3(){
        return calificacion3;
    }
    
    public void calcularPromedio(){
        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
        calcularPromedio();
        String cadena = String.format("%s %s\nCalificaciones: \n%.2f\n%.2f\n%.2f"
                + "\nPromedio: %.2f\n", 
                nombre, apellido, calificacion1,
                calificacion2, calificacion3, obtenerPromedio());
        return cadena;
    }
    /*
    José Mora
  Calificaciones:
  8.1
  9.1
  5.5
  Promedio ?
*/
}
