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
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataEst().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataEst().get(i));
        }
    }
    
    
}
