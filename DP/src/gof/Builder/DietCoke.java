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
public class DietCoke extends ColdDrink {

//    DietCoke() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   
    public float price() {
        return 35.0f;
    }

   
    public String name() {
        return "Diet Coke";
    }
}