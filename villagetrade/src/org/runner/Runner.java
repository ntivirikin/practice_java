package org.runner;

import org.trading.*;

public class Runner {
    public static void main(String... args) {

        // Probably need a function to go ahead and generate all the villages, towns, cities
        Village villOne = new Village("Colbrington", 500, 50, 3, 25);
        Village villTwo = new Village("Brightstone", 800, 10, 5, 0);

        // Trade 5 logs from Colbrington to Brightstone for 3 gold a piece, 15 gold total
        Trade.tradeLogs(villOne, villTwo, 5);

        // Check to make sure the trade happened successfully
        villOne.declareInfo();
        System.out.println("");
        villTwo.declareInfo();

    }

}
