package com.examplesite.trading;

public class Village extends TraderUnit {

    private static final Double logConvRate = 0.6;

    public Village(String initName, Integer initGold, Integer initLogs, Integer initPriceLogs, Integer initLumber) {
        super(initName, initGold, initLogs, initPriceLogs, initLumber, logConvRate);
    }

}
