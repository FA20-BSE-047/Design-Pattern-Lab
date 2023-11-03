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
import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Meal Builder!");
        System.out.println("Choose your meal type (1 for Vegetarian, 2 for Non-Vegetarian):");
        int mealType = scanner.nextInt();

        MealBuilder mealBuilder = new MealBuilder();
        Meal customMeal;

        if (mealType == 1) {
            customMeal = mealBuilder.prepareVegMeal();
        } else if (mealType == 2) {
            customMeal = mealBuilder.prepareNonVegMeal();
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        System.out.println("Choose your drink (1 for Coke, 2 for Pepsi, 3 for Diet Coke, 4 for Diet Pepsi, 5 for Tea):");
        int drinkChoice = scanner.nextInt();

        Item chosenDrink = null;
        switch (drinkChoice) {
            case 1:
                chosenDrink = new Coke();
                break;
            case 2:
                chosenDrink = new Pepsi();
                break;
            case 3:
                chosenDrink = (Item) new DietCoke();
                break;
            case 4:
                chosenDrink = new DietPepsi();
                break;
            case 5:
                Tea tea = new Tea();
                System.out.println("Choose your tea decoration (1 for Cream, 2 for Sugar, 3 for Cream and Sugar):");
                int decorationChoice = scanner.nextInt();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        customMeal.addItem(chosenDrink);

        System.out.println("Your custom meal:");
        customMeal.showItems();
        System.out.println("Total Cost: " + customMeal.getCost());

        
    }
}
