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
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Strategy add = new OperationPower();
        Context context = new Context(add);
        // 100 to 1000 is range for Subtraction, So Chain will deliver range specific operation
        System.out.println(context.computeInRange(1000, 999));
        // Direct Strategy Execution, No Chaining
        System.out.println(context.executeStrategy(2, 99));
    }
}