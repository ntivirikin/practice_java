package org.trading;

public class Village extends TraderUnit {

    public Village(String newName, Integer newLogs, Integer newLumber) {
        name = newName;
        numLogs = newLogs;
        numLumber = newLumber;
    }

    @Override
    public void convertLogs(Integer logsConverted) {

        if (logsConverted > numLogs) {
            System.out.println("There are not enough logs to convert!");
            return;
        }

        this.setLogs(this.getLogs() - logsConverted);
        int tempLumber = (int)(logsConverted * 0.7);
        this.setLumber(this.getLumber() + tempLumber);
    }
}
