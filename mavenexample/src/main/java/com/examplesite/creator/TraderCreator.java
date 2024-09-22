package com.examplesite.creator;

import java.util.ArrayList;
import java.util.Random;
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

        ArrayList<TraderUnit> villList = createTraders();

        for (TraderUnit vill : villList) {
            vill.declareInfo();
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

        // Create new Random object for value generation
        Random randomGen = new Random();

        // Select from village names and parameters
        if (traderType == "village") {
            Integer settleName = randomGen.nextInt(0, 4);
            Integer initGold = randomGen.nextInt(25, 51) * 10;
            Integer initLogs = randomGen.nextInt(1, 11) * 10;
            Integer initPriceLogs = randomGen.nextInt(2, 8);
            Integer initLumber = randomGen.nextInt(1, 6) * 10;
            Village newTrader = new Village(settleNames.get(settleName), initGold, initLogs, initPriceLogs, initLumber);
            return newTrader;

        } else if (traderType == "town") {
            Integer settleName = randomGen.nextInt(4, 7);
            Integer initGold = randomGen.nextInt(55, 120) * 10;
            Integer initLogs = randomGen.nextInt(8, 17) * 10;
            Integer initPriceLogs = randomGen.nextInt(4, 10);
            Integer initLumber = randomGen.nextInt(3, 10) * 10;
            Town newTrader = new Town(settleNames.get(settleName), initGold, initLogs, initPriceLogs, initLumber);
            return newTrader;

        } else if (traderType == "city") {
            Integer settleName = randomGen.nextInt(7, 10);
            Integer initGold = randomGen.nextInt(10, 25) * 100;
            Integer initLogs = randomGen.nextInt(12, 22) * 100;
            Integer initPriceLogs = randomGen.nextInt(8, 16);
            Integer initLumber = randomGen.nextInt(8, 22) * 10;
            City newTrader = new City(settleNames.get(settleName), initGold, initLogs, initPriceLogs, initLumber);
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
