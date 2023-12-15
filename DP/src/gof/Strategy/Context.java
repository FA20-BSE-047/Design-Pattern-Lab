/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Strategy;

/**
 *
 * @author elitebook g3
 */

public class Context {
    private final Strategy strategy;
    private final Strategy strategyChain;

    public Context(Strategy strategy) {
        this.strategy = strategy;
        this.strategyChain = new OperationAdd(new OperationSubtract(new OperationMultiply(new OperationDivide(new OperationPower()))));
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }


    public int computeInRange(int num1, int num2) {
        return strategyChain.computeInRange(num1, num2);
    }
}