package ru.itpark;

public class TaxiService {
    private int startOfDiscount = 1000;
    private int discountLimit = 100;
    double discountRate = 0.95;

    int count(int boardingCost, int kilometerCost, int distance) {
        int totalCost = boardingCost + (kilometerCost * distance);
        int discount = (int) (totalCost - (totalCost * discountRate));

        if (totalCost < startOfDiscount) {
            return totalCost;
        }

        if (discount <= discountLimit) {
            return totalCost - discount;
        }

        return totalCost - discountLimit;
    }
}
