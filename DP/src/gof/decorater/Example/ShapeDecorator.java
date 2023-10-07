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
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    protected double price;

    public ShapeDecorator(Shape decoratedShape, double price) {
        this.decoratedShape = decoratedShape;
        this.price = price;
    }

    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
         double cost = computeCost();
        System.out.println("Total Cost:" + cost);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

    @Override
    public double getPrice() {
      
        return decoratedShape.getPrice() + price;
    }
    
    public double computeCost() {
        // Calculate the cost by adding the cost of the decoration to the cost of the decorated shape
        return decoratedShape.computeCost() + price;
    }
}
