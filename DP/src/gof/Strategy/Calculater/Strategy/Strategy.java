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
public interface Strategy {
    int doOperation(int num1, int num2);

    int computeInRange(int num1, int num2);
}