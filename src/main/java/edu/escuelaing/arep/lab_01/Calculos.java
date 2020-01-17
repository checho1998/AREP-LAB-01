/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.lab_01;

import java.util.ArrayList;

/**
 *
 * @author sergio.nunez
 */
public class Calculos {
    
    private  ArrayList<Double> lista;

    public Calculos() {
        lista = new ArrayList<Double>();
        lista.add(186.0);
        lista.add(699.0);
        lista.add(132.0);
        lista.add(272.0);
        lista.add(291.0);
        lista.add(331.0);
        lista.add(199.0);
        lista.add(1890.0);
        lista.add(788.0);
        lista.add(1601.0);
    }
    
    public double sumatoria (ArrayList<Double> list){
        
        double suma = 0.0;
        
        for (int i=0; i<=list.size() ; i++  ){
            suma += list.get(i);
        }
        return suma;
    }
    
    public double media (ArrayList<Double> list){
        
        double res = sumatoria(list) / list.size();
        return res;
        
    }
    
    public double desviacionEstandar(ArrayList<Double> list){
        double media = media(list);
        double suma = 0.0; 
        for (int i=0; i<=list.size() ; i++  ){
            suma += Math.pow(list.get(i)-media, 2);
        }
        
        double res = Math.sqrt(suma/(list.size()-1));
        return res;
    }
    
}
