package org.runner;

import org.trading.*;

public class Runner {
    public static void main(String... args) {
        System.out.println("Conversion begins!");
        Village villageOne = new Village("Colbrington", 50, 25);

        System.out.println(villageOne.getName());
        System.out.println(villageOne.getLogs().toString());

        villageOne.convertLogs(20);

        System.out.println(villageOne.getLogs().toString());
        System.out.println(villageOne.getLumber().toString());
    }

}
