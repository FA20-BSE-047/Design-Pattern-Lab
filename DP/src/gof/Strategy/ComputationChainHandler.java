/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Strategy;

/**
 *
 * @author elitebook g3
 */

public interface ComputationChainHandler {
    void setNext(ComputationChainHandler handler);

    int computeInRange(int num1, int num2);
}