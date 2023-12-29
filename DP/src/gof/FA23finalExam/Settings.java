/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
public class Settings {
    private static Settings instance;
    private boolean notificationFeedbackRequired;

    private Settings() {
        // Private constructor to restrict instantiation
        notificationFeedbackRequired = false; // Default value
    }

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public boolean isNotificationFeedbackRequired() {
        return notificationFeedbackRequired;
    }
}
