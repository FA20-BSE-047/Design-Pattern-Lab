/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
public class Notification implements CommunicatingObject {
    private String content;
    private boolean feedbackRequired;

    public Notification(String content, boolean feedbackRequired) {
        this.content = content;
        this.feedbackRequired = feedbackRequired;
    }

    @Override
    public String getContent() {
        return content;
    }

    public void requestFeedback() {
        // Logic to request feedback
    }

    // Other methods and fields as needed
}
