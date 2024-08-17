package org.creator;

import java.util.ArrayList;

import org.trading.TraderUnit;
import org.trading.Village;
import org.trading.Town;
import org.trading.City;

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
}
