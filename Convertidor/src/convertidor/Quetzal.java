/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Quetzal extends Moneda{
    
          ArrayList<Double> denominaciones =new ArrayList<>();
    Map<String,Double> tc = new HashMap<>();
    
    
    public Quetzal(){
        updtDenominaciones();
        upDateTasa();
        this.setSimbolo('Q');
        this.setDenominaciones(denominaciones);
        this.setTasas(tc);
    }
    
    
    public void updtDenominaciones(){
        double[] d = {0.01,0.05, 0.10, 0.25,0.50,1,5,10,20,50,100,200};
        for (double e : d) {
             denominaciones.add(e);
        }
    }
    
    public void upDateTasa(){
        tc.put("Dolar",0.13);
        tc.put("Lempira",3.21);
        tc.put("Euro",0.11);
        tc.put("Quetzal",1.0);
    }
    
    
  

    public Map<String, Double> getTc() {
        return tc;
    }

    public void setTc(Map<String, Double> tc) {
        this.tc = tc;
    }

    
    
    
    
    @Override
    public String Info() {
           return " Mi nombre es Quetzal, Soy de Guatemala, mi simbolo es "+getSimbolo()+" mis denominaciones "+DenominacionesSTr();
    }
    
}
