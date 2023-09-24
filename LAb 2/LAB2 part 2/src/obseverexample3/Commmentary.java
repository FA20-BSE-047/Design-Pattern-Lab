/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obseverexample3;

/**
 *
 * @author elitebook g3
 */
import java.util.ArrayList;

public class Commmentary implements Publisher{
	ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	private String desc;
	
	@Override
	public void subsrcibe(Subscriber s) {
		if(!subscribers.contains(s)){
			subscribers.add(s);
		}
		
	}

	@Override
	public void unSubsrcibe(Subscriber s) {
		if(subscribers.contains(s)){
			subscribers.remove(s);
		}	
	}

	@Override
	public void notifySubscribers() {
		for(Subscriber s:subscribers){
			s.update(desc);
		}
		
	}

	public void setDesc(String desc) {
		this.desc = desc;
		notifySubscribers();
	}
}