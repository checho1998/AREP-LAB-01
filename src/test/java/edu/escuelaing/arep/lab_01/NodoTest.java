package edu.escuelaing.arep.lab_01;

import org.junit.Test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sergio.nunez
 */
public class NodoTest {
    @Test
    public void prueba () {
        Nodo nod1 = new Nodo(186.0);
        Nodo nod2 = new Nodo(699.0);
        LinkedList list = new LinkedList();
        
        list.add(nod1);
        System.out.println(list.size);
        System.out.println(list.get(0).getNum());
        
    }
}
