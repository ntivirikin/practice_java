package org.example;

import org.second.ExceptionPractice;

public class MainException {
    public static void main(String... args) throws Exception {
        try {
            ExceptionPractice.secondThrow();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
