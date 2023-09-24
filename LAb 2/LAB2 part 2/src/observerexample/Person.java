/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerexample;


public class Person implements Subscriber {
    String name;
    
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Publisher publisher) {
        if (publisher instanceof WhiteShirt) {
            WhiteShirt whiteShirt = (WhiteShirt) publisher;
            boolean inStock = whiteShirt.isInStock();
            
            if (inStock) {
                System.out.println("Hello " + name + ", white shirt is now in stock.");
            } else {
                System.out.println("Hello " + name + ", white shirt is currently out of stock.");
            }
        }
    }
}
