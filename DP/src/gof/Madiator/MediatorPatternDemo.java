/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Madiator;

/**
 *
 * @author fa20-bse-047
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        University comsatsUniversity = new University("COMSATS University");
        University nust = new University("NUST");
        Teacher teacherAli = new Teacher("Teacher Sir Ali");
        User mAli = new User("M Ali");
        User ahmad = new User("Ahmad");
        User ali = new User("Ali");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
        comsatsUniversity.sendMessage("Welcome to COMSATS, students!", mAli);
        mAli.sendMessage("Hello, friends!", comsatsUniversity, nust, teacherAli, ahmad, ali);
    }
}
