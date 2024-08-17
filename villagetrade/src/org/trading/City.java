package org.trading;

public class City extends TraderUnit {

    final Double logConvRate = 0.85;

    public City(String initName, Integer initGold, Integer initLogs, Integer initPriceLogs, Integer initLumber) {
        super(initName, initGold, initLogs, initPriceLogs, initLumber);
    }
    
}
