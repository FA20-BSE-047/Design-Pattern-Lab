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
public class EmployeeController {
  private IEmployee employee;

  public EmployeeController(IEmployee employee) {
    this.employee = employee;
  }

   

  public void generateOrgongram() {
    
  }

  public void giveBonus(int percentage) {
    employee.setSalary(employee.getSalary() + (employee.getSalary() * percentage) / 100);
  }

  public void activateBonus(String bonusType, int percentageOfBonus) {
  
  }
}