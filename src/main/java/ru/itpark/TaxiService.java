package ru.itpark;

public class TaxiService {
    private int startOfDiscount = 1000;
    private int discountLimit = 100;

    int count(int boardingCost, int kilometerCost, int distance) {
        int totalCost = boardingCost + (kilometerCost * distance);
        int discount = (int) (totalCost - (totalCost * 0.95));
        if (totalCost < startOfDiscount) {
            return totalCost;
        } else if (discount <= discountLimit) {
            totalCost = totalCost - discount;
        } else {
            totalCost = totalCost - discountLimit;
        }
        return totalCost;
    }
}
