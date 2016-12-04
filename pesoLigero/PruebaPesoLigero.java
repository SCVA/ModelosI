/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoLigero;

import generadorEntradaSalida.*;
/**
 *
 * @author SEBASTIAN
 */
public class PruebaPesoLigero {

    static FabricaPesoLigero fabricaRapidaAuto = new FabricaPesoLigero();
    static Auto autoOn;
    static Auto autoOff;
    static Auto autoPark;
    static boolean pruebaMecanica;
    static boolean pruebaHidraulica;
    static GenerarInOut generadorInOut;
    static TargetInteger adaptadorNumero;
    
    public static void main(String[] args) {
        int modificar = 0;
        do{
            int opcion = 0;
            generadorInOut = new GenerarInOut(new FabricaGrafico());
            adaptadorNumero = new AdaptadorStringInteger();
            generadorInOut.mostrar("Prueba de Frenos en: 1.Auto Encendido. 2.Auto Apagado. 3.Auto Parqueando.");
            opcion = adaptadorNumero.getInteger(generadorInOut.getCargador());
            switch(opcion){
                case 1:
                    autoOn = fabricaRapidaAuto.getAutoOn(autoOn);
                    pruebaMecanica = autoOn.pruebaFrenos(new FrenoMecanico());
                    pruebaHidraulica = autoOn.pruebaFrenos(new FrenoHidraulico());
                    break;
                case 2:
                    autoOff = fabricaRapidaAuto.getAutoOff(autoOff);
                    pruebaMecanica = autoOff.pruebaFrenos(new FrenoMecanico());
                    pruebaHidraulica = autoOff.pruebaFrenos(new FrenoHidraulico());
                    break;
                case 3:
                    autoPark = fabricaRapidaAuto.getAutoParking(autoPark);
                    pruebaMecanica = autoPark.pruebaFrenos(new FrenoMecanico());
                    pruebaHidraulica = autoPark.pruebaFrenos(new FrenoHidraulico());
                    break;
                default:
                    break;
            }
            generadorInOut.mostrar("La Prueba Hidraulica: "+pruebaHidraulica);
            generadorInOut.mostrar("La Prueba Mecanica: "+pruebaMecanica);
            generadorInOut.mostrar("Para otra prueba presione 0, si no presione 1");
            modificar = adaptadorNumero.getInteger(generadorInOut.getCargador());
        }while(modificar == 0);
    }
    
}
