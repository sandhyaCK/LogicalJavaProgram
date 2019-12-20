/*#******************************************************************************************************************
        # @purpose :Demonstrate CouponNumbers Logic.
        # @file  :CouponNumbers.java
        # @author :Sandhya
   #*****************************************************************************************************************/

package com.BridgeLabz.LogicalPrograms;

public class CouponNumbers {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card i has been collected
        int count = 0;                           // total number of cards collected
        int distinct = 0;                        // number of distinct cards
        while (distinct < n) {
            int value = (int) (Math.random() * n);   // random card between 0 and n-1
            count++;                                 // we collected one more card
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }

        // print the total number of cards collected
        System.out.println(count);
    }

}
