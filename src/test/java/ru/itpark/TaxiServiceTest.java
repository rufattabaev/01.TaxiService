package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    @DisplayName("Should calculate total cost of trip")
    void count() {
        {
            TaxiService service = new TaxiService();
            int totalCost = service.count(60, 20, 10);
            assertEquals(260, totalCost);
        }
        {
            TaxiService service = new TaxiService();
            int totalCost = service.count(60, 20, 50);
            assertEquals(1007, totalCost);
        }
        {
            TaxiService service = new TaxiService();
            int totalCost = service.count(60, 20, 100);
            assertEquals(1960, totalCost);
        }
    }


}