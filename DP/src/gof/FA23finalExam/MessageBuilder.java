/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
public class MessageBuilder {
    public Message createMessage(Stakeholder sender, Stakeholder receiver, String content) {
        return new Message(sender, receiver, content);
    }
    // Other methods or logic related to building messages
}
