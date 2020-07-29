/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

/**
 *
 * @author Admin
 */
public class Convertidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dolar d = new Dolar();
        
        System.out.println(d.Cambio(d.convertir(99, "Lempira")));
       int n=3; 
       view v = new view();
       v.setVisible(true);
    }
    
}
