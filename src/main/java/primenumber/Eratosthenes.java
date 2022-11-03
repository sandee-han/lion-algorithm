package primenumber;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1]; // 2~50까지 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기

        // 2의 배수 지우기
        int multipleOf = 2;
        for (int i = 0; i < nums.length; i+=2) {
            checks[i] = false;
        }

        // checks를 참고해서 true인 친구들만 nums[checks[i]]만 출력
        for (int i = 0; i < nums.length; i++) {
            if(checks[i] == true) System.out.printf("%d \t", nums[i]);
        }

    }
}
