package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class StatsServiceTest {
    //тест на метод № 1
    @Test
    void shouldCalcSum() {
       StatsService service = new StatsService();
       int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
       int expected = 180;

       int actual = service.calcSum(monthsSales);

       assertEquals(expected, actual);
    }

    //тест на метод № 2
    @Test
    void shouldСalcMean() {
        StatsService service = new StatsService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calcMean(monthsSales);

        assertEquals(expected, actual);
    }

    //тест на метод № 3
    @Test
    void shouldFindMax(){
        StatsService service = new StatsService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(monthsSales);

        assertEquals(expected, actual);
    }

    //тест на метод № 4
    @Test
    void shouldFindMin(){
        StatsService service = new StatsService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(monthsSales);

        assertEquals(expected, actual);

}

    //тест на метод № 5

    //тест на метод № 6

}
