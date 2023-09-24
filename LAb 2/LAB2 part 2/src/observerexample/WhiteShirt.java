/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerexample;

import java.util.ArrayList;

public class WhiteShirt implements Publisher {
    // ...

     private boolean inStock;

    // Constructor and other methods here...

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void notifySubscribers() {
        Iterable<Subscriber> subscribers = null;
        for (Subscriber s : subscribers) {
            s.update(this); // Pass the instance of WhiteShirt to subscribers
        }
    }

    @Override
    public void subscribe(Subscriber s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unscubscribe(Subscriber s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean isInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
