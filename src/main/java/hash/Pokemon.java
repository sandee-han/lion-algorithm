package hash;

import java.util.HashSet;
import java.util.Set;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/1845

포켓몬

[3, 2, 1, 2] : N = 2

: 3,2 / 3,1 / 3,2 / 2,1 / 2,2 / 1,2 총 6가지 방법

[3, 3, 2, 2, 1, 2] : N = 3

[3, 4, 2, 2, 1, 2, 4, 1] : N = 4


 */

public class Pokemon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // 중복을 없애기 위해
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int N = nums.length / 2;

        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }
    }

    public static void main(String[] args) {

    }
}
