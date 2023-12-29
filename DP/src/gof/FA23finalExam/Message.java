/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
public class Message implements CommunicatingObject {
    private Stakeholder sender;
    private Stakeholder receiver;
    private String content;

    public Message(Stakeholder sender, Stakeholder receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    
    public String getContent() {
        return content;
    }
    
}

