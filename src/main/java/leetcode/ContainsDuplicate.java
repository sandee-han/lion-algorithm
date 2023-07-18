package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)) return false;
            set.add(num);
        }
        return true;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> madeSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            madeSet.add(nums[i]);
        }
        if (nums.length == madeSet.size()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
