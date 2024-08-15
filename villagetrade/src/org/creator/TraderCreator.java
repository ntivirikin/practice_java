package org.creator;

import java.util.ArrayList;

import org.trading.TraderUnit;
import org.trading.Village;

public class TraderCreator {

    // Use hashmap or hashset here to easily retrieve by the name; placeholder for now
    public ArrayList<TraderUnit> createTraders() {

        Village villOne = new Village("Colbrington", 500, 50, 3, 25);
        Village villTwo = new Village("Brightstone", 800, 10, 5, 0);

        ArrayList<TraderUnit> villList = new ArrayList<TraderUnit>();
        villList.add(villOne);
        villList.add(villTwo);

        return villList;
    }

    // Add other methods here that will create Village, Town or City based on random numbers/names
    public TraderUnit createTraderUnit() {

        // Placeholder
        return new Village("", 0, 0, 0, 0);
    }
}
