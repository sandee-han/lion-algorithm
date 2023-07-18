package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> addAnswer = new ArrayList<>();
                    addAnswer.add(nums[i]);
                    addAnswer.add(nums[left]);
                    addAnswer.add(nums[right]);
                    answer.add(addAnswer);
                    left++;
                } else if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                }
                while (nums[left - 1] == nums[left] && right > left) {
                    left++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 0, 0, 0};
        // -4 -1 -1 0 1 2
        System.out.println(threeSum(nums));
        System.out.println(threeSum(nums2));
    }
}


