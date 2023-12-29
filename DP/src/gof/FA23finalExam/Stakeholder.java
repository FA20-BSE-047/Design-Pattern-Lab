/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stakeholder implements Observer {
    private String name;
    private String role;
    private String contactInfo;
    private List<CommunicatingObject> contents;

    public Stakeholder(String name, String role, String contactInfo) {
        this.name = name;
        this.role = role;
        this.contactInfo = contactInfo;
        this.contents = new ArrayList<>();
    }

    public void sendMessage(Stakeholder receiver, Message message) {
        
        receiver.receiveMessage(message);
    }

    public void receiveMessage(Message message) {
        
    }

    public void sendAnnouncement(Announcement announcement) {
        
    }

    public void sendNotification(Notification notification) {
        
    }

    public void sendSurvey(Survey survey) {
       
    }

   

    public void addContent(CommunicatingObject content) {
        contents.add(content);
    }

    public Iterator<CommunicatingObject> iterateContents() {
        return contents.iterator();
    }

    @Override
    public void update() {
       
    }

    void receiveAnnouncement(Announcement announcement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void receiveNotification(Notification notification) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void receiveSurvey(Survey survey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
