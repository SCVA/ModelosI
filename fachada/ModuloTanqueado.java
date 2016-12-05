/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

/**
 *
 * @author HOME_2
 */
public class ModuloTanqueado {
    public Auto tanquearAuto(Auto auto, double cantidad){
        
        cantidad+=auto.getCombustible();
        auto.setCombustible(cantidad);
        return auto;
    }
}
