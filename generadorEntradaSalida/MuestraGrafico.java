/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorEntradaSalida;

import javax.swing.JOptionPane;


/**
 *
 * @author SEBASTIAN
 */
public class MuestraGrafico extends Muestra{
    /*
        Metodo Imprimir
    */
    public void mostrar (String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,"Mensaje Importante",JOptionPane.INFORMATION_MESSAGE);
    }
}
