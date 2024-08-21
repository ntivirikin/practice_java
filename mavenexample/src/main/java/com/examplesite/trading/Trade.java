package com.examplesite.trading;

public class Trade {

    // Initiate trade of logs between two Traders
    public static void tradeLogs(TraderUnit seller, TraderUnit buyer, Integer numLogs) {

        // Determine cost of logs
        Integer totalCost = numLogs * seller.getLogPrice();

        // Check if the buyer can complete the trade; need Exception!
        if (totalCost > buyer.getGold()) {
            System.out.println("Buyer cannot complete the trade, not enough gold!");
            return;
        }

        // Seller loses logs and gains gold
        Integer currLogsSell = seller.getLogs();
        Integer currGoldSell = seller.getGold();

        seller.setLogs(currLogsSell - numLogs);
        seller.setGold(currGoldSell + totalCost);

        // Buyer gains logs and loses gold
        Integer currLogsBuy = buyer.getLogs();
        Integer currGoldBuy = buyer.getGold();

        buyer.setLogs(currLogsBuy + numLogs);
        buyer.setGold(currGoldBuy - totalCost);
    }

}
