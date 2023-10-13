/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.TemplateMethod.task;

/**
 *
 * @author elitebook g3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws IOException {

        Message message1 = null;
        MessageType messageType = null;
        Network network = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter\n" +
                "3 - Linkedln");
        int choice = Integer.parseInt(reader.readLine());

        System.out.println("\nChoose message type.\n" +
                "1 - ERROR\n" +
                "2 - WORKING\n" +
                "3 - INFO");
        int messagetypechoice = Integer.parseInt(reader.readLine());

        if (messagetypechoice == 1) {
            messageType = MessageType.ERROR;

        }

        else if (messagetypechoice == 2) {

            messageType = MessageType.WORKING;

        }

        else if (messagetypechoice == 3) {

            messageType = MessageType.INFO;

        }

        // Create proper network object and send the message.

        if (choice == 1) {
            network = new Facebook(userName, password);

            message1 = new Message(message, messageType, NetworkType.FACEBOOK);

        } else if (choice == 2) {
            network = new Twitter(userName, password);

            message1 = new Message(message, messageType, NetworkType.TWITTER);
        } else if (choice == 3) {
            network = new Linkedln(userName, password);

            message1 = new Message(message, messageType, NetworkType.LINKEDIN);
        }

        network.post(message1);
    }
}