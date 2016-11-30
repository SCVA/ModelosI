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
public class FrenoHidraulico extends Freno {

    boolean frenar(String estado) {
        if(estado.equals("apagado")){
            return false;
        }else{
            return true;
        }
    }
    
}
