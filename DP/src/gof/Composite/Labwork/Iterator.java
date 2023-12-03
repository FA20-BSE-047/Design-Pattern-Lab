/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Composite.Labwork;

/**
 *
 * @author elitebook g3
 */
public interface Iterator {
    boolean hasNext();
    IEmployee next();
    Object[] nextWithLevel();
    boolean hasNextWithLevel();
}