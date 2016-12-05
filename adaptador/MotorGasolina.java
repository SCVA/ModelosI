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
public abstract class MotorGasolina {
    
    public abstract void encender();
    public abstract float acelerarMetros(float velocidad, float fuerza);
    public abstract void apagar();
    
    public boolean pruebas(float velocidad, float fuerza){
        encender();
        acelerarMetros(velocidad, fuerza);
        apagar();
        return true;
    }
    
}
