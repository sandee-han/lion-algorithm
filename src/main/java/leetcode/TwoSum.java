package leetcode;

import java.util.*;

public class TwoSum {
    // 2트
    // Map을 쓰라는 힌트를 봤다.
    // 오키 성공
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] answer = new int[2];
        int count = 0;

        while (answer[1] == 0) {
            if (map.containsKey(target - nums[count]) && count != map.get(target - nums[count])) {
                answer[0] = count;
                answer[1] = map.get(target - nums[count]);
                break;
            }
            count++;
        }

        return answer;
    }

    // List의 contains 사용
    // 매우 느리다.
    public int[] twoSum2(int[] nums, int target) {
        int[] answer = new int[2];

        // .contains() 를 사용하기 위해서 입력 배열 arr를 List로 바꿔준다.
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        // List에 몇 개 있는지 확인하기 위한 count
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // target / 2 가 nums에 있을 경우, answer[]에 추가 및 count++
            if (target / 2 == nums[i]) {
                answer[count] = i;
                count++;
            }
        }

        // count 가 2면 return
        // 아닐경우 원래 조건문으로
        if (count == 2) {
            return answer;
        }

        // 마지막 값은 처리하지 않아도 괜찮다.
        for (int i = 0; i < nums.length - 1; i++) {
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
        int[] arr1 = {11, 2, 7, 15}; // target: 9
        int[] arr2 = {3, 2, 4}; // target: 6
        int[] arr3 = {3, 3};
        int[] arr4 = {3, 2, 3};

        int[] test1 = ts.twoSum(arr1, 9);
        int[] test2 = ts.twoSum(arr2, 6);
        int[] test3 = ts.twoSum(arr3, 6);
        int[] test4 = ts.twoSum(arr4, 6);

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));
        System.out.println(Arrays.toString(test4));
    }
}
