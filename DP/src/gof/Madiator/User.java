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
public class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
       ChatRoom.showMessage(this, message);
   }

    void sendMessage(String hello_friends, University comsatsUniversity, University nust, Teacher teacherAli, User ahmad, User ali) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}