package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public long salesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public long salesAvg(long[] sales) {
        return salesSum(sales) / sales.length;
    }

    // номер последнего месяца с максимальной продажей
    public int maxSalesMonthIndexLast(long[] sales) {
        int index = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[index]) {
                index = i;
            }
        }
        return index + 1;
    }

    // номер последнего месяца с минимальной продажей
    public int minSalesMonthIndexLast(long[] sales) {
        int index = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[index]) {
                index = i;
            }
        }
        return index + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int belowAvgSalesMonths(long[] sales) {
        long salesAvgValue = salesAvg(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale < salesAvgValue) {
                amount += 1;
            }
        }
        return amount;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int aboveAvgSalesMonths(long[] sales) {
        long salesAvgValue = salesAvg(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale > salesAvgValue) {
                amount += 1;
            }
        }
        return amount;
    }
}
