/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategia;

import pesoLigero.*;
import generadorEntradaSalida.*;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaEstrategia {

    static AutoParking auto;
    static GenerarInOut generadorInOut;
    static TargetInteger adaptadorNumero;
    
    public static void main(String[] args) {
        
        int posFinalY=0;
        int posFinalX;
        auto = new AutoParking();
        int posActualY;
        int posActualX;
        generadorInOut = new GenerarInOut(new FabricaGrafico());
        adaptadorNumero = new AdaptadorStringInteger();
        generadorInOut.mostrar("Inserte la posicion donde desea estacionar");
        posFinalX = adaptadorNumero.getInteger(generadorInOut.getCargador());
        auto.setPosFinalX(posFinalX);
        do{
            generadorInOut.mostrar("Inserte la poscion actual del vehiculo");
            auto.setPosActualX(adaptadorNumero.getInteger(generadorInOut.getCargador()));
        }while(auto.getPosActualX()==posFinalX);
        auto.setPosActualY(posFinalY);
        posActualY = auto.getPosActualY();
        posActualX = auto.getPosActualX();
        if(posActualY==posFinalY){
            if(posActualX<posFinalX){
                auto.setMoverPark(new ParqueoFrente());
            }else{
                auto.setMoverPark(new ParqueoCola());
            }
        }
        auto.parquear();
        generadorInOut.mostrar("La poscion actual del vehiculo es: "+auto.getPosActualX());
    }   
}
