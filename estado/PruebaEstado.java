/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

/**
 *
 * @author HOME_2
 */
public class PruebaEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto auto;
        
        auto= new AutoOff();
        auto.getEstado();
        
        auto= new AutoOn();
        auto.getEstado();
        
        auto= new AutoParqueado();
        auto.getEstado();
    }
}
