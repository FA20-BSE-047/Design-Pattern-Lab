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
public abstract class HotDrink implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return (Packing) new Bottle();
    }

    @Override
    public abstract float price();

}