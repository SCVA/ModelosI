/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

import java.awt.Color;

/**
 *
 * @author HOME_2
 */
public abstract class Auto {
    protected String referencia;
    protected Auto superior;
    
    private Auto(){
        
    }

    public Auto(String referencia) {
        this.referencia = referencia;
    }
    
    
    
    public abstract void caracteristicas(double valor);
    
    
    public Auto getSuperior() {
        return superior;
    }

    public Auto setSuperior(Auto superior) {
        this.superior = superior;
        return this;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
}
