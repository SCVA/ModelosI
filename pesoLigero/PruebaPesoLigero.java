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
public class PruebaPesoLigero {

    static FabricaPesoLigero fabricaRapidaAuto = new FabricaPesoLigero();
    static Auto autoOn;
    static Auto autoOff;
    static Auto autoPark;
    static boolean pruebaMecanica;
    static boolean pruebaHidraulica;
    
    public static void main(String[] args) {
        boolean modificar = true;
        do{
            int opcion = 0;
            switch(opcion){
                case 1:
                    autoOn = fabricaRapidaAuto.getAutoOn(autoOn);
                    pruebaMecanica = autoOn.pruebaFrenos(new FrenoMecanico());
                    pruebaHidraulica = autoOn.pruebaFrenos(new FrenoHidraulico());
                    break;
                case 2:
                    autoOff = fabricaRapidaAuto.getAutoOff(autoOff);
                    pruebaMecanica = autoOn.pruebaFrenos(new FrenoMecanico());
                    pruebaHidraulica = autoOn.pruebaFrenos(new FrenoHidraulico());
                    break;
                case 3:
                    autoPark = fabricaRapidaAuto.getAutoParking(autoPark);
                    pruebaMecanica = autoOn.pruebaFrenos(new FrenoMecanico());
                    pruebaHidraulica = autoOn.pruebaFrenos(new FrenoHidraulico());
                    break;
                default:
                    break;
            }
            modificar = false;
        }while(modificar);
    }
    
}
