/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Abstractfectory;

/**
 *
 * @author elitebook g3
 */
public class Rectangle implements Shape {

    Rectangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}