/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Enlace {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    
    /*
    public void insertarTrabajador(Trabajador trabajador) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores (cedula,"
                    + "nombres,correo,sueldo,mes) "
                    + "values (%d, '%s', '%s', %s, '%s')", 
                    trabajador.obtenerCedula(), 
                    trabajador.obtenerNombres(),
                    trabajador.obtenerCorreo(),
                    trabajador.obtenerSueldo(),
                    trabajador.obtenerMes());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
*/
    
    
    public ArrayList<Estudiante> obtenerDataEst() {  
        ArrayList<Estudiante> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Estudiante estudiante = new Estudiante();
                
                estudiante.establecerNombre(rs.getString("nombre"));
                estudiante.establecerApellido(rs.getString("apellido"));
                estudiante.establecerCalificacion1(rs.getDouble("calificacion1"));
                estudiante.establecerCalificacion2(rs.getDouble("calificacion2"));
                estudiante.establecerCalificacion3(rs.getDouble("calificacion3"));

                
                
                lista.add(estudiante);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }

     
}
