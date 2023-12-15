/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.State;

/**
 *
 * @author elitebook g3
 */
public interface Iterator<T> {
    T getCurrent();
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
    void reset();
}