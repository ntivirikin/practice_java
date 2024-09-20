package com.examplesite.creator;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.net.URISyntaxException;
import java.net.URL;

import com.examplesite.trading.TraderUnit;
import com.examplesite.trading.Village;
import com.examplesite.trading.Town;
import com.examplesite.trading.City;

public class TraderCreator {

    // Main to help figure out getResource() method
    public static void main(String... args) {
        ArrayList<String> returnSettleNames = new ArrayList<String>();

        // Attempt to acquire settlement names from resource
        try {
            returnSettleNames = readSettleNames();

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        for (String settleName : returnSettleNames) {
            System.out.println(settleName);
        }
    }

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

        // Catch two exceptions with | syntax
        } catch(IOException|URISyntaxException e) {
            System.out.println(e.toString());
            return null;
        }

        // Select from village names and parameters
        if (traderType == "village") {
            Village newTrader = new Village(settleNames.get(1), 500, 50, 3, 25);
            return newTrader;

        } else if (traderType == "town") {
            Town newTrader = new Town(settleNames.get(3), 500, 25, 25, 25);
            return newTrader;

        } else if (traderType == "city") {
            City newTrader = new City(settleNames.get(5), 1000, 100, 5, 80);
            return newTrader;
        }

        // If reaches end, return nothing since bad input
        // Can possibly throw an exception here
        return null;
    }

    // Read possible settlement names from resource file
    private static ArrayList<String> readSettleNames() throws IOException, URISyntaxException {

        // Create empty ArrayList to store each line of resource file
        ArrayList<String> fileLines = null;

        // Find path to resource
        URL url = TraderCreator.class.getResource("/settlementNames.txt");
        Path settlePath = Path.of(url.toURI());

        // Create array from each text file line
        fileLines = new ArrayList<String>(Files.readAllLines(settlePath));
        return fileLines;
    }
}
