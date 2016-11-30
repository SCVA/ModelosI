/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoLigero;

import java.awt.Color;

/**
 *
 * @author SEBASTIAN
 */
public abstract class Auto {
    protected Color color;
    protected int posActualX;
    protected int posActualY;
    protected String estado;
    protected Freno freno;
    public abstract boolean pruebaFrenos(Freno freno);

    public abstract void ejecutarEstado();
    
    /**
     * Metodos Get/Set
     * @return 
     */
    
    public int getPosActualX() {
        return posActualX;
    }

    public void setPosActualX(int posActualX) {
        this.posActualX = posActualX;
    }

    public int getPosActualY() {
        return posActualY;
    }

    public void setPosActualY(int posActualY) {
        this.posActualY = posActualY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
