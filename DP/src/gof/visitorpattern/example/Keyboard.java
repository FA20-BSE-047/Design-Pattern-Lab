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
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public void accept(ComputerPartMaintainer computerPartMaintainer) {
        computerPartMaintainer.maintain(this);
    }
}