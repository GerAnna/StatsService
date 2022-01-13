package ru.netology.stats;

public class StatsService {

    //метод № 1
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //метод № 2
    public int calcMean(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    //метод № 3
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]){
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //метод № 4
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //метод № 5

    //метод № 6
}
