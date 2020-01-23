package edu.escuelaing.arep.lab_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListsTest {
    @Test
    public void pruebaAgregarLinkedList () {
        Nodo nod1 = new Nodo(186.0);
        Nodo nod2 = new Nodo(699.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        System.out.println(list.size);
        assertTrue(nod1.equalsNodo(list.get(1)));
        assertTrue(nod2.equalsNodo(list.get(2)));
    }
    
    @Test
    public void pruebaBorrarLinkedList () {
        Nodo nod1 = new Nodo(186.0);
        Nodo nod2 = new Nodo(699.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        System.out.println(list.size);
        assertTrue(nod1.equalsNodo(list.get(1)));
        assertTrue(nod2.equalsNodo(list.get(2)));
    }
}
