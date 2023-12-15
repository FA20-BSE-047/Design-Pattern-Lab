/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Strategy;

/**
 *
 * @author elitebook g3
 */

public class OperationDivide implements Strategy, ComputationChainHandler {
    private ComputationChainHandler next;

    public OperationDivide() {
        this.setNext(null);
    }

    public OperationDivide(ComputationChainHandler next) {
        this.setNext(next);
    }

    OperationDivide(OperationPower operationPower) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int doOperation(int num1, int num2) {
        System.out.print("Division: " + num1 + " / " + num2 + " = ");
        return num2 != 0 ? (num1 / num2) : Integer.MIN_VALUE;
    }

    @Override
    public void setNext(ComputationChainHandler handler) {
        this.next = handler;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        boolean num1InRange = num1 >= 5000 && num1 <= 10000,
                num2InRange = num2 >= 5000 && num2 <= 10000;

        if (num1InRange && num2InRange) {
            return doOperation(num1, num2);
        } else if (next != null) {
            return next.computeInRange(num1, num2);
        } else {
            System.out.println("No handler For this range: " + num1 + "," + num2);
            return Integer.MIN_VALUE;
        }
    }
}
