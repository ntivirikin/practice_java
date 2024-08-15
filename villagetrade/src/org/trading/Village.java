package org.trading;

public class Village extends TraderUnit {

    // Construct Village with initial logs, lumber and a name
    public Village(String initName, Integer initGold, Integer initLogs, Integer initPriceLogs, Integer initLumber) {
        name = initName;
        numGold = initGold;
        numLogs = initLogs;
        priceLogs = initPriceLogs;
        numLumber = initLumber;
    }

    // Convert logs to lumber using Village converstion rate; may want to put conversions into enum
    // Can be made to accept any resource type, change resources to objects and create generic method
    @Override
    public void convertLogs(Integer logsConverted) {

        // This section needs to use Exceptions
        if (logsConverted > numLogs) {
            System.out.println("There are not enough logs to convert!");
            return;
        }

        this.setLogs(this.getLogs() - logsConverted);
        int tempLumber = (int)(logsConverted * 0.7);
        this.setLumber(this.getLumber() + tempLumber);
    }

}
