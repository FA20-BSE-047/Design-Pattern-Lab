/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerexample;

public interface Publisher {
	void subscribe(Subscriber s);
	void unscubscribe(Subscriber s);

}