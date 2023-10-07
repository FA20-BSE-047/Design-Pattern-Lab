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
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

    @Override
    public double getPrice() {
        return 20;
        
    }

     public double computeCost() {
        return getPrice(); // The cost of the shape itself
    }
}