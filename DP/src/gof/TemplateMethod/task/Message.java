/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.TemplateMethod.task;

/**
 *
 * @author elitebook g3
 */
public class Message {

    String description;
    MessageType messageType;
    NetworkType netwrokType;

    public Message(String description, MessageType messageType, NetworkType netwrokType) {
        this.description = description;
        this.messageType = messageType;
        this.netwrokType = netwrokType;

    }

    public String getDescription() {
        return description;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public NetworkType getNetwrokType() {
        return netwrokType;
    }

    public String toString() {

        return "Message{" +
                "description='" + description + '\'' +
                ", messageType=" + messageType +
                ", netwrokType=" + netwrokType +
                '}';

    }

}