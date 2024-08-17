package org.runner;

import java.util.ArrayList;

import org.creator.TraderCreator;
import org.trading.*;

public class Runner {
    public static void main(String... args) {
        ArrayList<TraderUnit> traderList = TraderCreator.createTraders();

        for (TraderUnit traderUnit : traderList) {
            System.out.println(traderUnit.getName());
        }
    }

}
