/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor ;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Dolar extends Moneda{
    ArrayList<Double> denominaciones =new ArrayList<>();
    Map<String,Double> tc = new HashMap<>();
    
    
    public Dolar(){
        updtDenominaciones();
        upDateTasa();
        this.setSimbolo('$');
        this.setDenominaciones(denominaciones);
        this.setTasas(tc);
    }
    
    
    public void updtDenominaciones(){
        double[] d = {0.01, 0.05, 0.10, 0.25, 0.50,1,2,5,10,20,50,100};
        for (double e : d) {
             denominaciones.add(e);
        }
    }
    
    public void upDateTasa(){
        tc.put("Lempira",24.77);
        tc.put("Quetzal",7.71);
        tc.put("Euro",0.58);
        tc.put("Dolar",1.0);
    }
    
    
  

    public Map<String, Double> getTc() {
        return tc;
    }

    public void setTc(Map<String, Double> tc) {
        this.tc = tc;
    }

    @Override
    public String Info() {
        return " Mi nombre es dolar, mi simbolo es "+getSimbolo()+" mis denominaciones "+DenominacionesSTr();
    }
    
}
