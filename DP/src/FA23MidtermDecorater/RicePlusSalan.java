/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FA23MidtermDecorater;

/**
 *
 * @author elitebook g3
 */
public class RicePlusSalan extends MealDecorator {

    public RicePlusSalan(Meal meal) {
        super(meal);
    }

    @Override
    public void order() {
        super.order();
        System.out.println("Added salan to the rice meal.");
    }
}
