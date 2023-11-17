/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ProxyPattern.LabTask;

/**
 *
 * @author fa20-bse-047
 */
public class VirtualExamProxy implements Exam {

  private RealExam realExam;

  public VirtualExamProxy() {
    // ... lazy initialization of realExam ...
  }

  @Override
  public void addAnswer(String answer) {
    realExam.addAnswer(answer);
  }

  @Override
  public void viewResults() {
    realExam.viewResults();
  }
}
