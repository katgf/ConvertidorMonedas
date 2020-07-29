/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import static java.util.Objects.hash;

/**
 *
 * @author Admin
 */
public abstract class Moneda {
    private ArrayList<Double> denominaciones;
    private char Simbolo;
    private Map<String,Double > tasas;
    
    public Moneda() {
    }

    public Map<String, Double> getTasas() {
        return tasas;
    }

    public void setTasas(Map<String, Double> tasas) {
        this.tasas = tasas;
    }

    public ArrayList<Double> getDenominaciones() {
        return denominaciones;
    }

    public void setDenominaciones(ArrayList<Double> denominaciones) {
        this.denominaciones = denominaciones;
    }

    public char getSimbolo() {
        return Simbolo;
    }

    public void setSimbolo(char Simbolo) {
        this.Simbolo = Simbolo;
    }
    
    public double convertir(double monto,String Moneda)
    {
        double tasaCambio = getTasas().get(Moneda);
        
        double valor = monto*tasaCambio;
        
        return valor;
    }
    
    public ArrayList<String> Cambio(double monto){
            Comparator c = Collections.reverseOrder();
       // Collections.sort(denominaciones,c);
        denominaciones.sort(c);
        ArrayList<String> retorno = new ArrayList<>();
        retorno.add(monto +": ");
         for (double d : denominaciones) {
            if(d<=monto){
                int cant = (int) (monto/d);
                monto = monto -(cant*d);
                retorno.add(cant+" de "+d);
            }
        }
         return retorno;
        
    }
    
    public String DenominacionesSTr(){
        String texto="";
        for (Double denominacione : denominaciones) {
            texto += String.valueOf(denominacione)+", ";
        }
        return texto;
    }
    
    
    public abstract String Info(); 
}
