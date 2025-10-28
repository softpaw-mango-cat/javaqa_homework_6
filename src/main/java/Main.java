import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        System.out.println("Сумма продаж: " + service.salesSum(sales));
        System.out.println("Средняя сумма продаж: " + service.salesAvg(sales));
        System.out.println("Номер месяца с последней максимальной продажей: " +
                service.maxSalesMonthIndexLast(sales));
        System.out.println("Номер месяца с последней минимальной продажей: " +
                service.minSalesMonthIndexLast(sales));
        System.out.println("Количество месяцев с продажами ниже среднего: " +
                service.belowAvgSalesMonths(sales));
        System.out.println("Количество месяцев с продажами выше среднего: " +
                service.aboveAvgSalesMonths(sales));
    }
}
