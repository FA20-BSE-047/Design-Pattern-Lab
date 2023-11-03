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