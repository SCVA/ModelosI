/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author HOME_2
 */
public class PruebaProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProxyAuto auto= new ProxyAuto("MyAuto","JKL902","ERNMF076");
        
        auto.acceder("jkjlj", "jljlj");
        
        auto.acceder("JKL902", "kjlj");
        
        auto.acceder("JKL902", "ERNMF076");
    }
    
}
