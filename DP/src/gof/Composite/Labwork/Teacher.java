/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Composite.Labwork;

/**
 *
 * @author fa20-bse-047
 */
public class Teacher extends BaseEmployee {
  private String qualification;

  public Teacher(String name, int salary, String qualification) {
    super(name, salary);
    this.qualification = qualification;
  }

    
  public String getQualification() {
    return qualification;
  }

    @Override
    public void setSalary(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}