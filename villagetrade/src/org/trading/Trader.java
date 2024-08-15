package org.trading;

public interface Trader {

    // Name of Village, Town or City
    public String getName();

    // Current amount of gold Trader owns
    public Integer getGold();

    // Retrieve number of logs
    public Integer getLogs();

    // Retrieve price of logs
    public Integer getLogPrice();

    // Retrieve number of lumber
    public Integer getLumber();

    // Convert logs to lumber based on type of Trader
    public void convertLogs(Integer convLogs);

    // Declare info about Trader
    public default void declareInfo() {

        // Name
        StringBuilder nameDeclare = new StringBuilder("The name of this settlement is ");
        nameDeclare.append(this.getName());
        nameDeclare.append("!");
        System.out.println(nameDeclare);

        // Start resource declaration
        System.out.println("The settlement has:");

        // Gold
        StringBuilder goldDeclare = new StringBuilder(this.getGold().toString());
        goldDeclare.append(" gold!");
        System.out.println(goldDeclare);

        // Logs
        StringBuilder logDeclare = new StringBuilder(this.getLogs().toString());
        logDeclare.append(" logs!");
        System.out.println(logDeclare);

        // Lumber
        StringBuilder lumberDeclare = new StringBuilder(this.getLumber().toString());
        lumberDeclare.append(" lumber!");
        System.out.println(lumberDeclare);
    }

}
