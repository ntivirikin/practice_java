package com.examplesite.trading;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TraderTest {

    @Test
    @DisplayName("Getting and Setting Village Fields")
    void testGetAndSetVillage() {

        Village testVill = new Village("TestVillage", 500, 15, 3, 0);
        assertEquals("TestVillage", testVill.getName());
        assertEquals(500, testVill.getGold());
        assertEquals(15, testVill.getLogs());
        assertEquals(3, testVill.getLogPrice());
        assertEquals(0, testVill.getLumber());
    }

    @Test
    @DisplayName("Converting Logs to Lumber in Village")
    void testConverLogsVillage() {

        Village testVill = new Village("TestVillage", 500, 30, 3, 0);
        assertEquals(0.6, testVill.getLogConvRate());
        testVill.convertLogs(10);
        assertEquals(6, testVill.getLumber());
        assertEquals(20, testVill.getLogs());
    }

    @Test
    @DisplayName("Trade Logs between Two Villages")
    void testTradeVillages() {
        Village testVillOne = new Village("TestVillageOne", 500, 30, 3, 0);
        Village testVillTwo = new Village("TestVillageTwo", 500, 30, 3, 0);
        Trade.tradeLogs(testVillOne, testVillTwo, 10);
        assertEquals(530, testVillOne.getGold());
        assertEquals(470, testVillTwo.getGold());
        assertEquals(20, testVillOne.getLogs());
        assertEquals(40, testVillTwo.getLogs());
    }
}
