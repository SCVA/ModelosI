/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoLigero;

import estrategia.*;

/**
 *
 * @author SEBASTIAN
 */
public class AutoParking extends Auto {

    MovmtoParqueo moverPark;
    int posFinalX;
    
    public AutoParking(){
        estado = "parqueado";
    }
    
    public boolean pruebaFrenos(Freno freno) {
        this.freno = freno;
        return this.freno.frenar(estado);
    }

    public void parquear(){
        do{
            posActualX = moverPark.parquear(posActualX);
        }while(posActualX!=posFinalX);
    }

    public void setMoverPark(MovmtoParqueo moverPark) {
        this.moverPark = moverPark;
    }

    public void setPosFinalX(int posFinalX) {
        this.posFinalX = posFinalX;
    }
    
    @Override
    public void ejecutarEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
