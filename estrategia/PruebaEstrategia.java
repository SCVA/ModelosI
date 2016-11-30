/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategia;

import pesoLigero.*;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaEstrategia {

    static AutoParking auto;
    
    public static void main(String[] args) {
        
        int posFinalY = 0;
        int posFinalX = 0;
        
        auto = new AutoParking();
        auto.setPosActualX(0);
        auto.setPosActualY(posFinalY);
        
        int posActualY = auto.getPosActualY();
        int posActualX = auto.getPosActualX();
        
        if(posActualY==posFinalY){
            if(posActualX<posFinalX){
                auto = new AutoParking(new ParqueoFrente(), posFinalX);
                auto.parquear();
            }else{ 
                if(posActualX>posFinalX){
                    auto = new AutoParking(new ParqueoCola(), posFinalX);
                    auto.parquear();
                }
            }
        }
    }
    
}
