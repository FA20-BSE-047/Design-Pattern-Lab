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

 abstract class BaseEmployee implements IEmployee {
  private String name;
  private
 
int salary;

  public BaseEmployee(String name, int salary)
 
{
    this.name = name;
    this.salary = salary;
  }

  @Override

  
public String getName()
 
{
    return name;
  }

  @Override

  
public int getSalary()
 
{
    return salary;
  }
}
