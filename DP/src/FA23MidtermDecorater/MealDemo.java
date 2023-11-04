/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FA23MidtermDecorater;

/**
 *
 * @author elitebook g3
 */
public class MealDemo {

    public static void main(String[] args) {
        
        Meal chickenKaramahi = new ChickenKaramahi();

       
        Meal meal = new ChickenKarahiPlusPepsi(new RicePlusChicken(new Rice()));

        
        meal.order();

       
        Meal rice = new Rice();

       
        Meal ricePlusSalan = new RicePlusSalan(rice);

       
        ricePlusSalan.order();
    }
}
