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
import java.util.List;

public interface IEmployee extends IEmployeeObserver {
    void giveBonus(int percent);
    void addSubordinate(IEmployee subordinate);
    List<IEmployee> getSubordinatesList();
    String getName();
    int getSalary();
    Iterator getIterator();

}
