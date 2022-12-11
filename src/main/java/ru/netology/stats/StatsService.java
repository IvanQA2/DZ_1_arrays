package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        long summa = 0;
        long sumSales = sales[0];
        for (long s : sales) {
            sumSales = summa + s;
            summa = sumSales;
        }
        return (int) sumSales;
    }

    public int averageSales(long[] sales) {
        long summa = 0;
        long sumSales = sales[0];
        for (long s : sales) {
            sumSales = summa + s;
            summa = sumSales;
        }
        long average = sumSales / sales.length;
        return (int) average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales [maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

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

    public int belowAverageSales(long[] sales) {
        long below = averageSales(sales);
        long sumMount = 0;
        long sumSales;
        for (long i : sales) {
            if (i < below) {
                sumSales = sumMount + 1;
                sumMount = sumSales;
            }
        }
        return (int) sumMount;
    }

    public int aboveAverageSales(long[] sales) {
        long above = averageSales(sales);
        long sumMount = 0;
        long sumSales;
        for (long i : sales) {
            if (i > above) {
                sumSales = sumMount + 1;
                sumMount = sumSales;
            }
        }
        return (int) sumMount;
    }
}
