package org.trading;

public interface Trader {

    // Trader name
    public String getName();

    // Retrieve number of logs
    public Integer getLogs();

    // Retrieve number of lumber
    public Integer getLumber();

    // Convert logs to lumber (based on type of Trader)
    public void convertLogs(Integer convLogs);

}
