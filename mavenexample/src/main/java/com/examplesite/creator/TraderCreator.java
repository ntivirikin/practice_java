package com.examplesite.creator;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.examplesite.trading.TraderUnit;
import com.examplesite.trading.Village;
import com.examplesite.trading.Town;
import com.examplesite.trading.City;

public class TraderCreator {

    // Use hashmap or hashset here to easily retrieve by the name; placeholder for now
    public static ArrayList<TraderUnit> createTraders() {

        // Add TraderUnit as value with key as TraderUnit name instead of ArrayList here
        ArrayList<TraderUnit> villList = new ArrayList<TraderUnit>();
        villList.add(createTraderUnit("village"));
        villList.add(createTraderUnit("town"));
        villList.add(createTraderUnit("city"));

        return villList;
    }

    // Add other methods here that will create Village, Town or City based on random numbers/names
    private static TraderUnit createTraderUnit(String traderType) {

        // Read file with village names and parameters
        ArrayList<String> settleNames = null;
        try {
            settleNames = readSettleNames();
        } catch(IOException e) {
            System.out.println(e.toString());
            return null;
        }

        for (String settleName : settleNames) {
            System.out.println(settleName);
        }

        // Select from village names and parameters
        if (traderType == "village") {
            Village newTrader = new Village("Colbrington", 500, 50, 3, 25);
            return newTrader;

        } else if (traderType == "town") {
            Town newTrader = new Town("Townsend", 500, 25, 25, 25);
            return newTrader;

        } else if (traderType == "city") {
            City newTrader = new City("Appleville", 1000, 100, 5, 80);
            return newTrader;
        }

        return null;

    }

    private static ArrayList<String> readSettleNames() throws IOException {

        ArrayList<String> fileLines = null;

        Path currentRelativePath = Paths.get(".\\resources\\settlementNames.txt");

        try {
            fileLines = new ArrayList<String>(Files.readAllLines(currentRelativePath));
        } catch(IOException ioe) {
            System.out.println(ioe.toString());
            throw ioe;
        }

        return fileLines;
    }
}
