/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obseverexample3;

public class Demo {

	public static void main(String[] args) {
		Commmentary commentary = new Commmentary();
		Subscriber subscriber = new SMSSubscriber("Shouzeb Hassan [Kohat]");
		commentary.subsrcibe(subscriber);

		Subscriber subscriber2 = new SMSSubscriber("Saim Jehangir [Nathiagali]");
		commentary.subsrcibe(subscriber2);

		commentary.setDesc("Welcome to live Soccer match");
		commentary.setDesc("Current score 0-0");
		commentary.unSubsrcibe(subscriber2);

		
		commentary.setDesc("It’s a goal!!");
		commentary.setDesc("Current score 1-0");

		Subscriber subscriber3 = new SMSSubscriber("Afaq Ahmed [Abbottabad]");
		commentary.subsrcibe(subscriber3);
		commentary.setDesc("It’s another goal!!");
		commentary.setDesc("Half-time score 2-0");


	}

}
