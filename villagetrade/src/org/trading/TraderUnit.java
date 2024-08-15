package org.trading;

public abstract class TraderUnit implements Trader {

    // Variables for TraderUnit
    String name;
    Integer numGold;
    Integer numLogs;
    Integer numLumber;
    Integer priceLogs;
    Integer priceLumber;

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

}
