/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create stakeholders
        Stakeholder student = new Stakeholder("Alice", "Student", "Contact info");
        Stakeholder teacher = new Stakeholder("Bob", "Teacher", "Contact info");

        // Create messages
        MessageBuilder messageBuilder = new MessageBuilder();
        Message message;
        message = messageBuilder.createMessage(student, teacher, "Hello, how are you?");

        // Create announcements
        AnnouncementBuilder announcementBuilder = new AnnouncementBuilder();
        Announcement announcement = announcementBuilder.createAnnouncement("Important announcement!");

        // Create notifications
        NotificationBuilder notificationBuilder = new NotificationBuilder();
        Notification notification = notificationBuilder.createNotification("Notification content", true);

        // Create surveys
        List<String> surveyQuestions = Arrays.asList("Question 1", "Question 2", "Question 3");
        SurveyBuilder surveyBuilder = new SurveyBuilder();
        Survey survey = surveyBuilder.createSurvey(surveyQuestions);

        // Create polling
        List<String> pollingOptions = Arrays.asList("Option A", "Option B", "Option C");
        PollingBuilder pollingBuilder = new PollingBuilder();
      

        // Create mediator and register stakeholders
        CommunicationSystemMediator mediator = new CommunicationSystemMediator();
        mediator.addObserver(student);
        mediator.addObserver(teacher);

        // Send different communications through the mediator
        mediator.sendMessage(student, teacher, message);
        mediator.sendAnnouncement(announcement);
        mediator.sendNotification(notification);
        mediator.sendSurvey(survey);
        
    }

    private static class AnnouncementBuilder {

        public AnnouncementBuilder() {
        }

        private Announcement createAnnouncement(String important_announcement) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class SurveyBuilder {

        public SurveyBuilder() {
        }

        private Survey createSurvey(List<String> surveyQuestions) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    
    }


