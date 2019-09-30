package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    void count() {
        TaxiService service = new TaxiService();
        int totalCost = service.count(60,20, 10 );
        assertEquals(260,totalCost );
    }
}