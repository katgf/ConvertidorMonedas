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
public class Lempira extends Moneda{
        ArrayList<Double> denominaciones =new ArrayList<>();
    Map<String,Double> tc = new HashMap<>();
    
    
    public Lempira(){
        updtDenominaciones();
        upDateTasa();
        this.setSimbolo('L');
        this.setDenominaciones(denominaciones);
        this.setTasas(tc);
    }
    
    
    public void updtDenominaciones(){
        double[] d = {0.05, 0.10, 0.20,0.50,1,2,5,10,20,50,100,500};
        for (double e : d) {
             denominaciones.add(e);
        }
    }
    
    public void upDateTasa(){
        tc.put("Dolar",0.040);
        tc.put("Quetzal",0.31);
        tc.put("Euro",0.034);
        tc.put("Lempira",1.0);
    }
    
    
  

    public Map<String, Double> getTc() {
        return tc;
    }

    public void setTc(Map<String, Double> tc) {
        this.tc = tc;
    }

    
    
    
    
    @Override
    public String Info() {
           return " Mi nombre es Lempira, Soy de Honduras, mi simbolo es "+getSimbolo()+" mis denominaciones "+DenominacionesSTr();
    }
    
}
