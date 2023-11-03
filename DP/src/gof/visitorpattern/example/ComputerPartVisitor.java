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
public interface ComputerPartVisitor {
     void visit(Computer computer);

     void visit(Mouse mouse);

     void visit(Keyboard keyboard);

     void visit(Monitor monitor);

     void visit(Multimedia multimedia);
}