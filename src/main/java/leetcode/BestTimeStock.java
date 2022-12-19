package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode #121
public class BestTimeStock {
    public static int maxProfit(int[] prices) {
        Map<Integer, Integer> priceMap = new HashMap<>();

        // Map에 기존 prices 저장
        for (int i = 0; i < prices.length; i++) {
            priceMap.put(prices[i], i);
        }

        // 오름차순 정렬
        Arrays.sort(prices);

        int smallIdx = 0;
        int bigIdx = prices.length - 1;

        while (smallIdx < prices.length) {
            while (bigIdx > smallIdx) {
                if (priceMap.get(prices[smallIdx]) < priceMap.get(prices[bigIdx])) {
                    return prices[bigIdx] - prices[smallIdx];
                }
                bigIdx--;
            }
            bigIdx = prices.length - 1;
            smallIdx++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {3,2,6,5,0,3};
        System.out.println(maxProfit(prices2));
    }
}
