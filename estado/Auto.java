/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import Muestras.Muestra;
import Muestras.MuestraConsola;

/**
 *
 * @author HOME_2
 */
public abstract class Auto {
    
    protected boolean motorEncendido;
    protected boolean motorReposo;
    protected boolean bateriaEncendida;
    protected boolean energiaAccesorios;
    public double rpmMotor;
    
    public abstract void getEstado();
    
    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isMotorReposo() {
        return motorReposo;
    }

    public void setMotorReposo(boolean motorReposo) {
        this.motorReposo = motorReposo;
    }

    public boolean isBateriaEncendida() {
        return bateriaEncendida;
    }

    public void setBateriaEncendida(boolean bateriaEncendida) {
        this.bateriaEncendida = bateriaEncendida;
    }

    public boolean isEnergiaAccesorios() {
        return energiaAccesorios;
    }

    public void setEnergiaAccesorios(boolean energíaAccesorios) {
        this.energiaAccesorios = energíaAccesorios;
    }

    public double getRpmMotor() {
        return rpmMotor;
    }

    public void setRpmMotor(double rpmMotor) {
        this.rpmMotor = rpmMotor;
    }

    
    
    
}
