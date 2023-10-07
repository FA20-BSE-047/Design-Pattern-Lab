/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.decorater.Example;

/**
 *
 * @author fa20-bse-047
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double getPrice() {
      
        return 10.0; 
    }


    public double computeCost() {
        return getPrice(); // The cost of the shape itself
    }
}