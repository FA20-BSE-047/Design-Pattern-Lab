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

public class Survey implements CommunicatingObject {
    private List<String> questions;

    public Survey(List<String> questions) {
        this.questions = new ArrayList<>(questions);
    }

    @Override
    public String getContent() {
        StringBuilder surveyContent = new StringBuilder();
        surveyContent.append("Survey Questions:\n");
        for (int i = 0; i < questions.size(); i++) {
            surveyContent.append(i + 1).append(". ").append(questions.get(i)).append("\n");
        }
        return surveyContent.toString();
    }
    
    // Additional methods to handle survey-specific functionalities if needed
}
