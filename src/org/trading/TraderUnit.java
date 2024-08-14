package org.trading;

public abstract class TraderUnit implements Trader {

    String name;
    Integer numLogs;
    Integer numLumber;
    Integer priceLogs;
    Integer priceLumber;

    @Override
    public String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
        return;
    }

    @Override
    public Integer getLogs() {
        return numLogs;
    }

    protected void setLogs(Integer newLogs) {
        numLogs = newLogs;
        return;
    }

    @Override
    public Integer getLumber() {
        return numLumber;
    }

    protected void setLumber(Integer newLumber) {
        numLumber = newLumber;
        return;
    }

}
