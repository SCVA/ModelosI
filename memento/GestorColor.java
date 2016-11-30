/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.awt.Color;

/**
 *
 * @author SEBASTIAN
 */
public class GestorColor {
    private MomentoColor memento;

    public MomentoColor getMemento() {
        return memento;
    }

    public void setMemento(MomentoColor memento) {
        this.memento = memento;
    }
    
    public Color obtenerColor(){
        return memento.getColor();
    }
    
}
