/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Muestras;

import javax.swing.JOptionPane;

/**
 *
 * @author HOME_2
 */
public class MuestraGrafica extends Muestra{  
    public void mostrar(Object mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
