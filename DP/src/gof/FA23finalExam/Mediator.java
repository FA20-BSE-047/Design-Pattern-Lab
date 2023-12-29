/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
public interface Mediator {
    void sendMessage(Stakeholder sender, Stakeholder receiver, Message message);
    void sendAnnouncement(Announcement announcement);
    void sendNotification(Notification notification);
    void sendSurvey(Survey survey);
    
    void addObserver(Stakeholder stakeholder);
    void removeObserver(Stakeholder stakeholder);
    void notifyObservers();
}
