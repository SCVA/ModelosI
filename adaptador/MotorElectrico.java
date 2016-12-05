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
public class MotorElectrico {
    
    private boolean combustible;
    private boolean energia;
    
    public void combustion(){
        combustible = true;
    }
    
    public void energia(){
        energia = true;
    }
    
    public float acelerarCentimetros(float velocidad, float fuerza){
        if(combustible&&energia){
            return velocidad*fuerza;
        }else{
            return 0;
        }
    }
                
    public void offenergia(){
        energia = false;
    }
    
    public void offCombustible(){
        combustible = false;
    }
    
}
