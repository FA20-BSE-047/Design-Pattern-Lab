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
public class OperationPower extends ComputationChainHandler {
    private ComputationChainHandler next;

    public OperationPower() {
        this.setNext(null);
    }

    public int doOperation(int num1, int num2) {
        BigInteger result = (new BigInteger(String.valueOf(num1))).pow(num2);
        if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
            System.out.print("Power: " + num1 + " ^ " + num2 + " = ");
            return Integer.parseInt(result.toString());
        }else {
            System.out.println("Power: " + num1 + " ^ " + num2 + " = " + result);
            System.out.print("Result is out of range for int type, returning Integer.MIN_VALUE ");
            return Integer.MIN_VALUE;
        }
    }

    public void setNext(ComputationChainHandler handler) {
        this.next = handler;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        boolean num1InRange = num1 >= 10000 && num1 <= 200000,
                num2InRange = num2 >= 10000 && num2 <= 200000;
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