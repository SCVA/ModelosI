/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

public abstract class Auto {

    private Motor motor;
    private Deposito deposito;

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

}
