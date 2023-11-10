/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Strategy.Calculater.Strategy;

/**
 *
 * @author fa20-bse-047
 */
public class OperationMultiply implements Strategy, ComputationChainHandler {
    private ComputationChainHandler next;

    public OperationMultiply() {
        this.setNext(null);
    }

    public OperationMultiply(ComputationChainHandler next) {
        this.setNext(next);
    }

    @Override
    public int doOperation(int num1, int num2) {
        System.out.print("Multiplication: " + num1 + " * " + num2 + " = ");
        return num1 * num2;
    }

    @Override
    public void setNext(ComputationChainHandler handler) {
        this.next = handler;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        boolean num1InRange = num1 >= 1000 && num1 <= 5000,
                num2InRange = num2 >= 1000 && num2 <= 5000;
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