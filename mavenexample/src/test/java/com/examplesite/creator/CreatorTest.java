package com.examplesite.creator;

import com.examplesite.trading.TraderUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreatorTest {

    @Test
    @DisplayName("Creating Trader Settlements")
    void createTrader() {

        // Create array of traders
        ArrayList<TraderUnit> traders = TraderCreator.createTraders();

        // Check names of each settlement created
        assertEquals(traders.get(0).getName(), "Colbrington");
        assertEquals(traders.get(1).getName(), "Townsend");
        assertEquals(traders.get(2).getName(), "Appleville");
    }
    
}
