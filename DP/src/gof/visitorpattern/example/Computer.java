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
public class Computer implements ComputerPart {

    ComputerPart[] parts;
    public ComputerPart mouse,keyboard,monitor,multimedia;
    public Computer() {
        this.mouse = (ComputerPart) new Mouse();
        this.keyboard = (ComputerPart) new Keyboard();
        this.monitor = (ComputerPart) new Monitor();
        this.multimedia = new Multimedia();
        parts = new ComputerPart[]{mouse, keyboard, monitor, multimedia};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }


    @Override
    public void accept(ComputerPartMaintainer computerPartMaintainer) {
        for (ComputerPart part:parts) {
            part.accept(computerPartMaintainer);
        }
    }
}