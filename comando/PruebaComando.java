/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import generadorEntradaSalida.*;
import pesoLigero.AutoOff;
import pesoLigero.AutoOn;
import pesoLigero.AutoParking;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaComando {

    static GenerarInOut generadorInOut;
    static TargetInteger adaptadorNumero;
    
    public static void main(String[] args) {
        int opcion = 0;
        SuperBoton superboton = null;
        generadorInOut = new GenerarInOut(new FabricaGrafico());
        adaptadorNumero = new AdaptadorStringInteger();
        generadorInOut.mostrar("Inserte la funcionalidad principal del carro");
        opcion = adaptadorNumero.getInteger(generadorInOut.getCargador());
        switch(opcion){
            case 1:
                superboton = new SuperBoton(new AutoOn());
                break;
            case 2:
                superboton = new SuperBoton(new AutoOff());
                break;
            case 3:
                superboton = new SuperBoton(new AutoParking());
                break;
            default:
                break;
        }
        generadorInOut.mostrar("Ejecutando Super Boton");
        superboton.accionar();        
    }
}
