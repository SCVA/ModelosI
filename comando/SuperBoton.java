/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import pesoLigero.Auto;

/**
 *
 * @author SEBASTIAN
 */
public class SuperBoton {
    
    private Auto auto;

    public SuperBoton(Auto auto) {
        this.auto = auto;
    }
    
    public void accionar(){
        auto.ejecutarEstado();
    }
    
}
