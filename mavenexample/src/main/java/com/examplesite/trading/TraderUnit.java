package com.examplesite.trading;

public abstract class TraderUnit implements Trader {

    // Variables for TraderUnit
    String name;
    Integer numGold;
    Integer numLogs;
    Integer numLumber;

    // Change these to a map of objects eventually, with own variables
    Integer priceLogs;
    Integer priceLumber;
    final Double logConvRate; // Need to initialize this in the constructor, pass it up from child classes

    public TraderUnit(String initName, Integer initGold, Integer initLogs, Integer initPriceLogs, Integer initLumber, Double newLogConvRate) {
        name = initName;
        numGold = initGold;
        numLogs = initLogs;
        priceLogs = initPriceLogs;
        numLumber = initLumber;
        logConvRate = newLogConvRate; // Received from child class, hardcoded
    }

    // Name getter
    @Override
    public String getName() {
        return name;
    }

    // Name setter
    protected void setName(String newName) {
        this.name = newName;
        return;
    }

    @Override
    public Integer getGold() {
        return this.numGold;
    }

    public void setGold(Integer newGold) {
        this.numGold = newGold;
        return;
    }

    // Num logs getter
    @Override
    public Integer getLogs() {
        return this.numLogs;
    }

    // Num logs setter
    protected void setLogs(Integer newLogs) {
        this.numLogs = newLogs;
        return;
    }

    // Price logs getter
    @Override
    public Integer getLogPrice() {
        return this.priceLogs;
    }

    // Num logs setter
    protected void setLogPrice(Integer newLogPrice) {
        this.priceLogs = newLogPrice;
        return;
    }

    // Conversion rate logs getter
    @Override
    public Double getLogConvRate() {
        return this.logConvRate;
    }

    // Num lumber getter
    @Override
    public Integer getLumber() {
        return this.numLumber;
    }

    // Num lumber setter
    protected void setLumber(Integer newLumber) {
        this.numLumber = newLumber;
        return;
    }

    // Convert logs to lumber
    public void convertLogs(Integer convLogs) {

        // This section needs to use Exceptions
        if (convLogs > this.getLogs()) {
            System.out.println("There are not enough logs to convert!");
            return;
        }

        this.setLogs(this.getLogs() - convLogs);
        int tempLumber = (int)(convLogs * logConvRate);
        this.setLumber(this.getLumber() + tempLumber);

    }

}
