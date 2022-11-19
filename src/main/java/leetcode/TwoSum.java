package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsList.contains(target - nums[i]) && target != nums[i] * 2) {
                answer[0] = i;
                answer[1] = numsList.indexOf(target - nums[i]);
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int[] arr1 = {3, 2, 4};

        int[] test = ts.twoSum(arr, 9);
        System.out.println(Arrays.toString(test));
    }
}
