/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author HOME_2
 */
public class Tractomula extends Auto{
    ArrayList<Auto> autos;
    public Tractomula(String ref) {
        super(ref);
    }

    public void agregar(Auto auto){
        if(autos==null){
            autos= new ArrayList<Auto>();
        }
        this.autos.add(auto);
    }
    
    public void remover(String ref){
        for(int i=0; i<autos.size();i++){
            
            if(autos.get(i).referencia.equals(ref)){
                autos.remove(i);
            }
        }
        
    }
    
    public Auto obtenerAuto(String ref){
        Auto auto = this;
        for(int i=0; i<autos.size();i++){
            
            if(autos.get(i).referencia.equals(ref)){
                auto=autos.remove(i);
            }
        }
        
        return auto;
        
    }
    
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
    
}
