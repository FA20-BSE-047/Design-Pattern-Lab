/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerexample;

public class Demo {

	public static void main(String[] args) {
		WhiteShirt shirt = new WhiteShirt();
		
		Person shouzeb = new Person("Shouzeb");
		Person khurram = new Person ("Khurram");
		Person waleed = new Person ("Waleed");
		
		shirt.subscribe(shouzeb);
		shirt.subscribe(waleed);
		
		shirt.setInStock(true);
		shirt.setInStock(false);
		
		shirt.unscubscribe(shouzeb);
		
                shirt.setInStock(true);
		

	}

}