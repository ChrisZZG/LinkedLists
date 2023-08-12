/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linkedlists;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author EQUIPO
 */
public class LinkedLists {

    public static void main(String[] args) {
        System.out.println("LINKEDLIST");
        //Instanciar empleado como una LIST de tipo LinkedList que contendra Empleados
        List<Empleado> lista = new LinkedList<Empleado> ();
        
        //Agregar empleados normalmente
        lista.add(new Empleado(2, "Pepe", "Argento", "Zapatero"));
        lista.add(new Empleado(3, "Moni", "Argento", "Ama de Casa"));
        
        //Agregar empleados al Inicio
        lista.add(0, new Empleado(4, "Paola", "Argento", "Modelo"));
        
        //Mostrar la Linked List
        for(Empleado emple:lista){
            System.out.println("Nombre: " + emple.getNombre());
            System.out.println("----------------------");
        }
    }
}
