package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode #121
public class BestTimeStock {
    public static int maxProfit(int[] prices) {
        int L = 0;
        int R = 1;
        int maxValue = 0;

        while (R < prices.length) {
            if (prices[R] > prices[L]) {
                maxValue = Math.max(maxValue, prices[R] - prices[L]);
            } else {
                L = R;
            }
            R++;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {3,2,6,5,0,3};
        int[] prices3 = {7,6,4,3,1};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }
}
