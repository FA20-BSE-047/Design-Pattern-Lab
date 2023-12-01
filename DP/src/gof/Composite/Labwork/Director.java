/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Composite.Labwork;

import java.util.ArrayList;
import java.util.List;

public class Director extends BaseEmployee {
  private List<IEmployee> subordinate;

  public Director(String name, int salary, List<IEmployee> subordinate) {
    super(name, salary);
    this.subordinate = subordinate;
  }

  public List<IEmployee> getSubordinate() {
    return subordinate;
  }

    @Override
    public void setSalary(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
