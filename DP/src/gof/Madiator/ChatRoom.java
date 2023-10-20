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

import java.util.Date;

public class ChatRoom {
    public static void sendMessage(AbstractUser user, String message, AbstractUser... users) {
        System.out.print(new Date().toString() + " [" + user.name() + "] : " + message);

        if (users.length > 0) {
            System.out.print(" (To: ");
            for (int i = 0; i < users.length; i++) {
                System.out.print(users[i].name());
                if (i < users.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(")");
        }
        System.out.println();
    }

    static void showMessage(User aThis, String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
