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
import java.util.List;

public class CommunicationSystemMediator implements Mediator {
    private List<Stakeholder> stakeholders;

    public CommunicationSystemMediator() {
        this.stakeholders = new ArrayList<>();
    }

    
    public void sendMessage(Stakeholder sender, Stakeholder receiver, Message message) {
        // Logic to send message from sender to receiver
        receiver.receiveMessage(message);
    }

    
    public void sendAnnouncement(Announcement announcement) {
        // Logic to broadcast announcement to all stakeholders
        for (Stakeholder stakeholder : stakeholders) {
            stakeholder.receiveAnnouncement(announcement);
        }
    }

   
    public void sendNotification(Notification notification) {
        // Logic to send notification to stakeholders
        for (Stakeholder stakeholder : stakeholders) {
            stakeholder.receiveNotification(notification);
        }
    }

  
    public void sendSurvey(Survey survey) {
        // Logic to send survey to stakeholders
        for (Stakeholder stakeholder : stakeholders) {
            stakeholder.receiveSurvey(survey);
        }
    }

    
   

    
    public void addObserver(Stakeholder stakeholder) {
        stakeholders.add(stakeholder);
    }

    
    public void removeObserver(Stakeholder stakeholder) {
        stakeholders.remove(stakeholder);
    }

   
    public void notifyObservers() {
        // Notify stakeholders of any updates if needed
    }

   
    }

