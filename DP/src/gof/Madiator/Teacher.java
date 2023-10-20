/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Madiator;

/**
 *
 * @author fa20-bse-047
 */
public class Teacher implements AbstractUser {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

   

    @Override
    public String name() {
        return name;
    }

    @Override
    public void sendMessage(String message, AbstractUser... users) {
        ChatRoom.sendMessage(this, message, users);
    }
}
