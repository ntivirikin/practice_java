package org.second;

public class ExceptionPractice {

    public static void secondThrow() throws Exception {
        firstThrow();
    }

    public static void firstThrow() throws Exception {
        try {
            initialThrow();
        } catch(Exception e) {
            throw e;
        }
    }

    public static void initialThrow() throws Exception {
        Exception excpt = new Exception("This is a test exception!");
        throw excpt;
    }
    
}
