package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        // .contains() 를 사용하기 위해서 입력 배열 arr를 List로 바꿔준다.
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        // i + 1 조건을 위해 length - 1 처리. 어차피 마지막 값은 처리하지 않아도 괜찮다.
        for (int i = 0; i < nums.length - 1; i++) {
            // target이 nums[i]의 두배이면서, nums[i+1]도 같은 값인 경우 ex. {3, 3}, target: 6
            if (target == nums[i] * 2 && target == nums[i + 1] * 2) {
                answer[0] = i;
                answer[1] = i + 1;
            }
            // nums[i]를 뺀 값이 배열에 존재하는지 확인.
            // target이 nums[i]의 두배이면서 nums에 하나밖에 없느 경우 제외
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
        int[] arr1 = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 4};
        int[] arr3 = {3, 3};

        int[] test1 = ts.twoSum(arr1, 9);
        int[] test2 = ts.twoSum(arr2, 6);
        int[] test3 = ts.twoSum(arr3, 6);
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));
    }
}
