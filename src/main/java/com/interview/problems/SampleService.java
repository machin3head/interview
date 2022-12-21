package com.interview.problems;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SampleService {

    /**
     *      input array will contain 3 or more elements and less than 100 elements
     *      TODO: return a char array with the elements reversed
     *       BONUS: implement without using a separate char[] array
     */
    public char[] reverseString(char[] chars) {
        return chars;
    }



    /**
     *      input List will contain 1 or more elements and less than 100 elements
     *      TODO: return the earliest chronological date from the given list
     */
    public LocalDateTime getEarliestDateFromList(List<LocalDateTime> datesList) {
        return datesList.get(0);
    }



    /**
     *      input array will contain 1 or more elements and less than 100 elements
     *      TODO: return the sum of all elements in the given array
     *          sample: array [3,2,80]
     *          return: 85
     */
    public int sumAllElements(int[] arr) {
        return 1;
    }



    /**
     *      input array will contain 1 or more elements and less than 100
     *      TODO: return the max consecutive count that the given int occurs in array
     *          sample: nums[0,0,1,1,1,0,1,0,0,1], comp=1
     *          return: 3
     */
    public int findMaxConsecutiveOccurrences(int[] nums, int given) {
        return nums[0];
    }



    /**
     *      map will contain 1 or more entries and less than 32 entries
     *      map keys will be pre-sorted (ascending) smallest to largest (1...31)
     *      sample map:
     *          {1=90} day 1 was 90 degrees
     *          {2=87} day 2 had 87 degrees
     *          {3=90} day 3 had 90 degrees
     *      TODO: this is a bugfix for the existing code
     *          if multiple days have the same highest temperature, return the earliest day (smallest key)
     *          explanation of example above:
     *              days 1 & 3 have the same highest temperature of 90 degrees
     *              day 1 should be returned
     */
    public int getDayOfMonthWithHighestTemperature(LinkedHashMap<Integer, Integer> dayWithTemperatureMap) {
        int highestTemperature = 0;
        int dayOfMonthWithHighestTemp = 1;
        for (Map.Entry<Integer, Integer> entry : dayWithTemperatureMap.entrySet()) {
            if (entry.getValue() > highestTemperature) {
                dayOfMonthWithHighestTemp = entry.getKey();
            }
        }
        return dayOfMonthWithHighestTemp;
    }
}
