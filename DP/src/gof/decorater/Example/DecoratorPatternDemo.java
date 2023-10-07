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
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle(), 5.0); 
        Shape redRectangle = new RedShapeDecorator(new Rectangle(), 7.0); 

        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Price: " + circle.getPrice());

        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("Price: " + redCircle.getPrice());

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        System.out.println("Price: " + redRectangle.getPrice());
    }
}
