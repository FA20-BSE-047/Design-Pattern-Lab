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
public class ChainPatternDemo {
	
 private static AbstractLogger getChainOfLoggers() {
   AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
   AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
   AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
   AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.WARNING); // Add DatabaseLogger for warnings

   // Set up the chain of responsibility
   errorLogger.setNextLogger(fileLogger);
   fileLogger.setNextLogger(consoleLogger);
   consoleLogger.setNextLogger(databaseLogger); // Connect the DatabaseLogger

   return errorLogger;
}
 private static AbstractLogger getInfoWarningErrorChainOfLoggers() {
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger warningLogger = new ConsoleLogger(AbstractLogger.WARNING);
        AbstractLogger errorLogger = new ConsoleLogger(AbstractLogger.ERROR);

        // Set up the chain of responsibility
        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

 public static void main(String[] args) {
   AbstractLogger loggerChain = getChainOfLoggers();

   loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
   loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
   loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
   loggerChain.logMessage(AbstractLogger.WARNING, "This is a warning information.");
   
   AbstractLogger infoWarningErrorLoggerChain = getInfoWarningErrorChainOfLoggers();

        infoWarningErrorLoggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        infoWarningErrorLoggerChain.logMessage(AbstractLogger.WARNING, "This is a warning information.");
        infoWarningErrorLoggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

        // Create a separate chain for DEBUG messages
        AbstractLogger debugLoggerChain = new ConsoleLogger(AbstractLogger.DEBUG);

        debugLoggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
}
}