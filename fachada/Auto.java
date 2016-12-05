/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import java.awt.Color;

public abstract class Auto {

    protected Motor motor;
    protected Deposito deposito;
    protected double combustible;
    protected Color color;
    
    private Auto() {

    }

    public Auto(Motor motor, Deposito dispensador) {
        this.motor = motor;
        this.deposito = dispensador;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito dispensador) {
        this.deposito = dispensador;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
}
