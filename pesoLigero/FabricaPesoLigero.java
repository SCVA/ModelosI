/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoLigero;

import java.util.HashSet;

/**
 *
 * @author SEBASTIAN
 */
public class FabricaPesoLigero {
    
    private HashSet<Auto> autos= new HashSet<Auto>();
    
    public  Auto getAutoOn(Auto id){
        if(autos.contains(id)){
            return id;
        }else{
            Auto autoOn = new AutoOn();
            autos.add(autoOn);
            return autoOn;
        }
    }
    
    public  Auto getAutoOff(Auto id){
        if(autos.contains(id)){
            return id;
        }else{
            Auto autoOff = new AutoOff();
            autos.add(autoOff);
            return autoOff;
        }
    }
    
    public  Auto getAutoParking(Auto id){
        if(autos.contains(id)){
            return id;
        }else{
            Auto autoParking = new AutoParking();
            autos.add(autoParking);
            return autoParking;
        }
    }
    
}
