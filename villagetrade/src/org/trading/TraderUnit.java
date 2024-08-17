package org.trading;

public abstract class TraderUnit implements Trader {

    // Variables for TraderUnit
    String name;
    Integer numGold;
    Integer numLogs;
    Integer numLumber;

    // Change these to a map of objects eventually, with own variables
    Integer priceLogs;
    Integer priceLumber;
    Double logConvRate;

    public TraderUnit(String initName, Integer initGold, Integer initLogs, Integer initPriceLogs, Integer initLumber, Double initLogConvRate) {
        name = initName;
        numGold = initGold;
        numLogs = initLogs;
        priceLogs = initPriceLogs;
        numLumber = initLumber;
        logConvRate = initLogConvRate;
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

    // Conversion rate log setter
    protected void setLogConvRate(Double newLogConvRate) {
        this.logConvRate = newLogConvRate;
        return;
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
