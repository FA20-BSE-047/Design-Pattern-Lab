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
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

   
    public String name() {
        return "Chicken Burger";
    }
}