/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.chainofresponsibiity.Example1;

/**
 *
 * @author fa20-bse-047
 */
public class DatabaseLogger extends AbstractLogger {

   public DatabaseLogger(int level) {
      this.level = level;
   }

   @Override
   protected void write(String message) {
      // Simulate logging to a database
      System.out.println("Database::Logger: " + message);
   }
}
