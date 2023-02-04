package ru.netology.stats.javaqa.HomeWorkJavamvn6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    @Test // 1. Сумма всех продаж
    public void shouldCheckSumSales () {
        StatsService service = new StatsService();

        long expectedAmount = 180;
        long actualAmount = service.getSumSales(sales);

        Assertions.assertEquals(expectedAmount,actualAmount);
    }

    @Test // 2. Средняя сумма продаж в месяц
    public void shouldCheckAverageSumSales () {
        StatsService service = new StatsService();

        long expectedAmount = 15;
        long actualAmount = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAmount,actualAmount);
    }

    @Test // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public void shouldCheckMaxSales() {
        StatsService service = new StatsService();

        long expectedAmount = 8;
        long actualAmount = service.maxSales(sales);

        Assertions.assertEquals(expectedAmount,actualAmount);
    }

    @Test // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public void shouldCheckMinSales() {
        StatsService service = new StatsService();

        long expectedAmount = 9;
        long actualAmount = service.minSales(sales);

        Assertions.assertEquals(expectedAmount,actualAmount);
    }

    @Test // 5. Количество месяцев, в которых продажи были ниже среднего
    public void shouldCheckBellowAverageSales() {
        StatsService service = new StatsService();

        long expectedAmount = 5;
        long actualAmount = service.bellowAverageSales(sales);

        Assertions.assertEquals(expectedAmount,actualAmount);
    }

    @Test // 6. Количество месяцев, в которых продажи были выше среднего
    public void shouldCheckAboveAverageSales() {
        StatsService service = new StatsService();

        long expectedAmount = 5;
        long actualAmount = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedAmount,actualAmount);
    }
}
