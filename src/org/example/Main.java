package org.example;

import org.second.TakeThis;

class Main {
    public static void main(String... args) {
        System.out.println("Hello, Main World!");
    }
}

class MainOne {
    public static void main(String... args) {
        System.out.println("Hello, World One!");

        String takeThisOutput = TakeThis.takeThis();
        System.out.println(takeThisOutput);
    }

}

class MainTwo {

    public static void main(String... args) {
        System.out.println("Hello, World Two!");

        String takeThisOutput = TakeThis.takeThis();
        StringBuilder takeBuilder = new StringBuilder(takeThisOutput);

        takeBuilder.append(" Again!");
        System.out.println(takeBuilder);
    }

}
