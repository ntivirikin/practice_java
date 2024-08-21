package com.examplesite;

import java.util.ArrayList;

import com.examplesite.creator.TraderCreator;
import com.examplesite.trading.TraderUnit;

public class Runner {
    public static void main(String[] args) {
        ArrayList<TraderUnit> traders = TraderCreator.createTraders();

        for (TraderUnit trader : traders) {
            trader.declareInfo();
        }
    }
}