/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Composite.Labwork;
import java.util.List;
/**
 *
 * @author fa20-bse-047
 */
public class DOO extends BaseEmployee {
    String rank;

    public DOO(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public void giveBonus(int percent) {
        System.out.println("DOO " + name + " got " + (percent*salary/100) + " bonus");
    }

    @Override
    public void addSubordinate(IEmployee subordinate) {
        System.err.println("DOO cannot have subordinates");

    }

    @Override
    public void update(String change){
        System.out.println("DOO "+name+" got notification from University of change:"+change);
    }

    @Override
    public List<IEmployee> getSubordinatesList() {
        return null;
    }
    @Override
    public String toString() {
        return "\nDOO{" + "\nName='" + name + '\'' +
                ", \nSalary=" + salary +
                ", \nRank='" + rank + '\'' +
                "\n} ";
    }
}