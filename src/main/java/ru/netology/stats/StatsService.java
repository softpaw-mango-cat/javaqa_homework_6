package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public int salesAvg(int[] sales) {
        return salesSum(sales) / sales.length;
    }

    // номер последнего месяца с максимальной продажей
    public int maxSalesMonthIndexLast(int[] sales) {
        int index = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[index]) {
                index = i;
            }
        }
        return index + 1;
    }

    // номер последнего месяца с минимальной продажей
    public int minSalesMonthIndexLast(int[] sales) {
        int index = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[index]) {
                index = i;
            }
        }
        return index + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int belowAvgSalesMonths(int[] sales) {
        int salesAvgValue = salesAvg(sales);
        int amount = 0;
        for (int sale : sales) {
            if (sale < salesAvgValue) {
                amount += 1;
            }
        }
        return amount;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int aboveAvgSalesMonths(int[] sales) {
        int salesAvgValue = salesAvg(sales);
        int amount = 0;
        for (int sale : sales) {
            if (sale > salesAvgValue) {
                amount += 1;
            }
        }
        return amount;
    }
}
