package ru.netology.stats.javaqa.HomeWorkJavamvn6;
public class StatsService {
    // 1. Сумма всех продаж
    public long getSumSales(long[] sales){
        long sum = 0;
        for (long sale : sales) {
            sum = sale + sum;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public long averageSumSales(long[] sales){
        long sum = 0;
        for (long sale : sales) {
            sum = sale + sum;
        }
        return sum / sales.length;
    }

    // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего
    public int bellowAverageSales(long[] sales){
        int countMonthMin = 0;
        long averageSum = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                countMonthMin++;
            }
        }
        return countMonthMin;
    }

    // 6. Количество месяцев, в которых продажи были выше среднего
    public int aboveAverageSales(long[] sales){
        int countMonthMax = 0;
        long averageSum = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                countMonthMax++;
            }
        }
        return countMonthMax;
    }
}
