/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.awt.Color;
import pesoLigero.*;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaMemento {

    public static void main(String[] args) {
        GestorColor gestor = new GestorColor();
        Auto auto = new AutoOn();
        auto.setColor(Color.yellow);
        gestor.setMemento(new MomentoColor(auto.getColor()));
        auto.setColor(Color.red);
        auto.setColor(gestor.obtenerColor());
    }
    
}
