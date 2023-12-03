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

public abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected int salary;

    public BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator(this);
    }
    public abstract void giveBonus(int percent);

    @Override
    public abstract void update(String change);
}