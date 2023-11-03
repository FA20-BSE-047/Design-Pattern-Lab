/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Builder;

/**
 *
 * @author fa20-bse-047
 */
public abstract class ColdDrink implements Item {

    
    public Packing packing() {
        return (Packing) new Bottle();
    }

    
    public abstract float price();
}