/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoLigero;

/**
 *
 * @author SEBASTIAN
 */
public class AutoOff extends Auto {
    
    public AutoOff(){
        estado = "apagado";
    }
    
    public boolean pruebaFrenos(Freno freno) {
        this.freno = freno;
        return this.freno.frenar(estado);
    }

    @Override
    public void ejecutarEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
