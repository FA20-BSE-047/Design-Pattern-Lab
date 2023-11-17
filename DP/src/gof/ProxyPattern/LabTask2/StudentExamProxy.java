/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ProxyPattern.LabTask2;

/**
 *
 * @author fa20-bse-047
 */
public class StudentExamProxy implements Exam {

  private RealExam exam;
  private String studentId;

  public StudentExamProxy(String studentId) {
    this.studentId = studentId;
  }

  @Override
  public void addAnswer(String answer) {
    exam.addAnswer(answer);
  }

  @Override
  public void viewResults() {
    System.out.println("Exam results for student " + studentId + ":");
    for (String answer : exam.getAnswers()) {
      if (answer.startsWith(studentId + "-")) {
        System.out.println(answer);
      }
    }
  }
}