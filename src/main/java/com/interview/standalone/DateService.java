package com.interview.standalone;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateService {

    // input List will contain 1 or more elements and less than 100 elements
    // TODO implement
    //   logic: return the earliest chronological date from the given list
    public LocalDateTime getEarliestDateFromList(List<LocalDateTime> datesList) {
        return datesList.get(0);
    }


    // input array will contain 1 or more elements and less than 32 elements
    // array elements will all be positive
    // TODO implement
    //   logic: return the sum of all elements in the transaction count array
    public int getSumOfAllTransactions(int[] monthlyTransactions) {
        return 1;
    }


    // map will contain 1 or more entries and less than 32 entries
    // entry keys will be pre-sorted (ascending) smallest to largest
    // sample map: (key can be 1...31, value can be 0....10000)
    //    {1=190} day 1 had 190 transactions
    //    {2=128} day 2 had 128 transactions
    //    {3=190} day 3 had 190 transactions
    // TODO bugfix: multiple days can have the same transaction count
    //   logic: return the earliest day if multiple days have the same highest transaction count
    //   case:  days 1 and 3 both have the highest transactions, 1 should be returned
    public int getDayOfMonthWithMostTransactions(HashMap<Integer, Integer> daysWithCountMap) {
        int highestTransactionCount = 0;
        int dayOfMonthWithMostTransactions = 1;
        for (Map.Entry<Integer, Integer> entry : daysWithCountMap.entrySet()) {
            if (entry.getValue() > highestTransactionCount) {
                dayOfMonthWithMostTransactions = entry.getKey();
            }
        }
        return dayOfMonthWithMostTransactions;
    }
}
