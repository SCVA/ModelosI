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
public class CargaGrafico extends Carga{
    /*
        Metodo Obtener
    */
    public String cargar (){
        String mensaje;
        mensaje = JOptionPane.showInputDialog(null,"Inserte un texto", "Ingresar", JOptionPane.QUESTION_MESSAGE);
        return mensaje;
    }
}
