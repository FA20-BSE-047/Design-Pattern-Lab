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
public class DOO extends BaseEmployee {
  private String rank;

  public DOO(String name, int salary, String rank) {
    super(name, salary);
    this.rank = rank;
  }

    
  public String getRank() {
    return rank;
  }

    @Override
    public void setSalary(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}