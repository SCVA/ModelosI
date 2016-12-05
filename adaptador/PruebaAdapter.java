/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import generadorEntradaSalida.*;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaAdapter {

    static GenerarInOut generadorInOut;
    static TargetInteger adaptadorNumero;
    static MotorGasolina motorGasolina;
    
    public static void main(String[] args) {
        int cantidadMotores = 0;
        generadorInOut = new GenerarInOut(new FabricaGrafico());
        adaptadorNumero = new AdaptadorStringInteger();
        generadorInOut.mostrar("Digite cuantos motores se adaptaran para probar su adaptabilidad");
        cantidadMotores = adaptadorNumero.getInteger(generadorInOut.getCargador());
        for(int i=0;i<cantidadMotores;i++){
            motorGasolina = new AdaptadorMElectricoToGasol(new MotorElectrico());
            if(motorGasolina.pruebas(1000, 1000)){
                generadorInOut.mostrar("Adaptabilidad Perfecta para el Motor "+(i+1));
            }
        }
    }
}
