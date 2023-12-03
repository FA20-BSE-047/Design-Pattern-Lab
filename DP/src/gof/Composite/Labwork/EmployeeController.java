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

    private static IEmployee root;
    private static EmployeeController employeesController;
    private static UniversitySubject universitySubject;

    public void generateOrganogram() {
        Iterator iterator = root.getIterator();
        while (iterator.hasNextWithLevel()) {
            Object[] employee = iterator.nextWithLevel();
            int level = (int) employee[0];
            IEmployee current = (IEmployee) employee[1];

            String indentation = getIdentation(level);
            System.out.println(indentation + current.getClass().getSimpleName() + " " + current.getName());
        }
    }

    private String getIdentation(int level) {
        if (level == 0) {
            return "";
        }
        String defaultIndentation = "|\t";
        String defaultPointer = "└── ";

        return defaultIndentation.repeat(level - 1) + defaultPointer;
    }

    //Give bonus to all employees
    public void activateBonus(int percent) {
        Iterator iterator = root.getIterator();
        while (iterator.hasNext()) {
            IEmployee employee = iterator.next();
            employee.giveBonus(percent);
        }
    }

    //Give bonus to specific employees
    public void activateBonus(int percent, String... type) {
        Iterator iterator = root.getIterator();
        while (iterator.hasNext()) {
            IEmployee employee = iterator.next();
            for (String s : type) {
                if (employee.getClass().getSimpleName().equalsIgnoreCase(s)) {
                    employee.giveBonus(percent);
                }
            }
        }
    }

    //Subscribe all employees to university
    public void subscribeToUniversity() {
        Iterator iterator = root.getIterator();
        while (iterator.hasNext()) {
            IEmployee employee = iterator.next();
            universitySubject.registerObserver(employee);
        }
    }

    public void updateUniversity(String change) {
        universitySubject.notifyObservers(change);
    }

    public void updateUniversity(String change, String... type) {
        universitySubject.notifyObservers(change, type);
    }

    private EmployeeController() {
        initializeOrganization();
    }

    public static EmployeeController getInstance() {
        if (employeesController == null) {
            employeesController = new EmployeeController();
        }
        return employeesController;
    }

    //Method to initialize the organization
    private void initializeOrganization() {
        IEmployee teacherCs1 = new Teacher("Usama khan", 10200, "in class", "Ph.D in Computer Science");
        IEmployee teacherCs2 = new Teacher("Sara khan", 101500, "online", "Ph.D. in Artificial Intelligence");
        IEmployee teacherSe1 = new Teacher("Mr. Mukhtiar Zamin", 450000, "on leave", "Master In Software Engg");
        IEmployee teacherSe2 = new Teacher("Dr. Ahmad Saeed Khattack", 1000000, "in class", "Ph.D in Data Science");

        IEmployee dooCs1 = new DOO("Jawad", 200000, "1st");
        IEmployee dooCs2 = new DOO("Zulqarnain", 250000, "2nd");
        IEmployee dooEe1 = new DOO("Kamran", 520000, "1st");
        IEmployee dooSe1 = new DOO("Nadia", 530000, "1st");
        IEmployee dooSe2 = new DOO("Imran", 510000, "2nd");

        IEmployee hodCs = new HOD("Ali", 600000, "Computer Science");
        IEmployee hodEe = new HOD("Sana", 650000, "Electrical Engineering");
        IEmployee hodSe = new HOD("Farhan", 620000, "Software Engineering");

        hodCs.addSubordinate(teacherCs1);
        hodCs.addSubordinate(teacherCs2);
        hodCs.addSubordinate(dooCs1);
        hodCs.addSubordinate(dooCs2);

        hodEe.addSubordinate(dooEe1);

        hodSe.addSubordinate(teacherSe1);
        hodSe.addSubordinate(teacherSe2);

        hodSe.addSubordinate(dooSe1);
        hodSe.addSubordinate(dooSe2);

        IEmployee director = new Director("Zain", 700000);
        director.addSubordinate(hodCs);
        director.addSubordinate(hodEe);
        director.addSubordinate(hodSe);
        root = director;
        universitySubject = new UniversitySubject();
    }
}