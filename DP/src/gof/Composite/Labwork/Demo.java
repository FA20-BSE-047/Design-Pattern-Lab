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
import java.util.ArrayList;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
    List<IEmployee> subordinate = new ArrayList<>();
    subordinate.add(new Teacher("Alice", 10000, "Bachelors"));
    subordinate.add(new Teacher("Bob", 12000, "Masters"));

    HOD hod = new HOD("Carol", 15000, subordinate);

    List<IEmployee> subordinate1 = new ArrayList<>();
    subordinate1.add(hod);

    DOO doo = new DOO("Dave", 20000, "Senior Director");

    List<IEmployee> subordinate2 = new ArrayList<>();
    subordinate2.add(doo);

    Director director = new Director("Eve", 25000, subordinate2);

    EmployeeController employeeController = new EmployeeController(director);

    // Generate the orgongram
    employeeController.generateOrgongram();

    // Give a 10% bonus to all employees
    employeeController.giveBonus(10);

    // Activate the performance bonus for the director
    employeeController.activateBonus("Performance", 20);
  }
}