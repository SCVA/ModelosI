/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import java.awt.Color;

/**
 *
 * @author HOME_2
 */
public class ModuloPintado {
    public Auto pintarAuto(Auto auto,Color color){
        auto.setColor(color);
        return auto;
    }
}
