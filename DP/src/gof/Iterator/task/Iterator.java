/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Iterator.task;

/**
 *
 * @author elitebook g3
 */
public interface Iterator {
   boolean hasNext();

    Object next();

    boolean hasPrevious();

    Object previous();

    Object moveTofirst();

    Object moveTolast();
}