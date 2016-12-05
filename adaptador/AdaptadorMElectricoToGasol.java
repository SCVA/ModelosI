/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

/**
 *
 * @author SEBASTIAN
 */
public class AdaptadorMElectricoToGasol extends MotorGasolina{

    MotorElectrico motorElectrico;

    public AdaptadorMElectricoToGasol(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }
    
    public void encender() {
        motorElectrico.combustion();
        motorElectrico.energia();
    }
   
    public void apagar() {
        motorElectrico.offCombustible();
        motorElectrico.offenergia();
    }
    
    public float acelerarMetros(float velocidad, float fuerza) {
        return motorElectrico.acelerarCentimetros(velocidad, fuerza)/100;
    }
    
}
