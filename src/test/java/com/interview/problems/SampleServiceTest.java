package com.interview.problems;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleServiceTest {

    private final SampleService testClass = new SampleService();

    @Test
    public void getEarliestDateFromList() {
        LocalDateTime _2021_04_10_endOfDay = LocalDateTime.of(2021, Month.APRIL, 10, 23, 59, 59, 999999999);
        LocalDateTime _2021_05_11_endOfDay = LocalDateTime.of(2021, Month.MAY, 11, 23, 59, 59, 999999999);
        LocalDateTime _2022_03_10_endOfDay = LocalDateTime.of(2022, Month.MARCH, 10, 23, 59, 59, 999999999);
        LocalDateTime _2025_07_31_endOfDay = LocalDateTime.of(2025, Month.JULY, 31, 23, 59, 59, 999999999);

        List<LocalDateTime> dates = Arrays.asList(
                _2022_03_10_endOfDay,
                _2021_05_11_endOfDay,
                _2021_04_10_endOfDay,
                _2025_07_31_endOfDay);

        LocalDateTime result = testClass.getEarliestDateFromList(dates);

        assertEquals(_2021_04_10_endOfDay, result);
    }

    @Test
    public void sumAllElements() {
        int[] transactions = {132,54,65,8,97,1,34,6,44,47,87,346,76,123,43};

        int result = testClass.sumAllElements(transactions);

        int expectedTotal = 1163;
        assertEquals(expectedTotal, result);
    }

    @Test
    public void findMaxConsecutiveOnes() {
        int[] nums = {0,0,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1};
        int var = 1;

        int result = testClass.findMaxConsecutiveOccurrences(nums, var);

        int expectedTotal = 5;
        assertEquals(expectedTotal, result);
    }

    @Test
    public void getFirstDayWithHighestTransactions() {
        LinkedHashMap<Integer, Integer> dayToCountMap = new LinkedHashMap<>(31);
        loadMap(dayToCountMap);

        int result = testClass.getDayOfMonthWithHighestTemperature(dayToCountMap);

        int dayWithHighestValue = getExpectedValue();
        assertEquals(dayWithHighestValue, result);
    }

    private void loadMap(HashMap<Integer, Integer> dayToCountMap) {
        for (int i=1; i<15; i++) {
            dayToCountMap.put(i, i*i);
        }
        dayToCountMap.put(18, 213);
        dayToCountMap.put(11, 199);
        dayToCountMap.put(13, 213);
        dayToCountMap.put(14, 187);
        dayToCountMap.put(10, 225);
        dayToCountMap.put(17, 222);
        dayToCountMap.put(15, 224);
        dayToCountMap.put(12, 84);
        dayToCountMap.put(16, 225);
        dayToCountMap.put(20, 225);
        dayToCountMap.put(19, 3);
    }

    private int getExpectedValue() {
        return 10;
    }
}