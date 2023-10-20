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
public class University implements AbstractUser {
    private String name;

    public University(String name) {
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

    void sendMessage(String welcome_to_COMSATS_students, User mAli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
