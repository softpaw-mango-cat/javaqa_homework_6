package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void checkSalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSalesAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.salesAvg(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMaxLastSaleMonthNumber() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSalesMonthIndexLast(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMinLastSaleMonthNumber() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSalesMonthIndexLast(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkBelowAvgSalesMonths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAvgSalesMonths(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAboveAvgSalesMonths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAvgSalesMonths(sales);

        Assertions.assertEquals(expected, actual);
    }
}
