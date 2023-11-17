/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ProxyPattern.LabTask2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-047
 */
public class RealExam implements Exam {

  private List<String> answers;

  public RealExam() {
    answers = new ArrayList<>();
  }

  @Override
  public void addAnswer(String answer) {
    answers.add(answer);
  }

  @Override
  public void viewResults() {
    System.out.println("Exam results:");
    for (String answer : answers) {
      System.out.println(answer);
    }
  }

    Iterable<String> getAnswers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}