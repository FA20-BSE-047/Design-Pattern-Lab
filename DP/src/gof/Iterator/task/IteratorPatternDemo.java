/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Iterator.task;

/**
 *
 * @author elitebook g3
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        StudentsRepository studentsRepository = new StudentsRepository();
        studentsRepository.sort();
        StudentIterator studentIterator=studentsRepository.getIterator();
        studentIterator.printStudentWithNameStartingFrom("P");
        studentIterator.printAll();
    }
}