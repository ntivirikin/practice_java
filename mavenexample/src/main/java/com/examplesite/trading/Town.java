package com.examplesite.trading;

public class Town extends TraderUnit {

    private static final Double logConvRate = 0.75;

    public Town(String initName, Integer initGold, Integer initLogs, Integer initPriceLogs, Integer initLumber) {
        super(initName, initGold, initLogs, initPriceLogs, initLumber, logConvRate);
    }
    
}
