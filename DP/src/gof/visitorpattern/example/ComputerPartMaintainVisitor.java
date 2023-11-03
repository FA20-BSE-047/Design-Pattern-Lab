/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.visitorpattern.example;

/**
 *
 * @author fa20-bse-047
 */
public class ComputerPartMaintainVisitor implements ComputerPartMaintainer {

    @Override
    public void maintain(Computer computer) {
        System.out.println("Maintaining Computer.");
    }

    @Override
    public void maintain(Mouse mouse) {
        System.out.println("Maintaining Mouse.");
    }

    @Override
    public void maintain(Keyboard keyboard) {
        System.out.println("Maintaining Keyboard.");
    }

    @Override
    public void maintain(Monitor monitor) {
        System.out.println("Maintaining Monitor.");
    }

    @Override
    public void maintain(Multimedia multimedia) {
        System.out.println("Maintaining Multimedia.");
    }
}