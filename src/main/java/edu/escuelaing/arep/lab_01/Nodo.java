/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.lab_01;

/**
 *
 * @author sergio.nunez
 */

public class Nodo {
    
    private double num;
    private Nodo next = null;
    private Nodo back = null;
    
    public Nodo (double valor){
        num = valor ;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public Nodo getBack() {
        return back;
    }

    public Nodo getNext() {
        return next;
    }

    public double getNum() {
        return num;
    }
    
}
