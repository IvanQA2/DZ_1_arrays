package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test

    public void minSalesMountService() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void summaService() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSales(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void averageService() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSales(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void maxSalesMountService() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void belowSalesMountService() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowAverageSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void aboveSalesMountService() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aboveAverageSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}