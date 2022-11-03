package primenumber;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1]; // 2~50까지 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기


        int num = 1;
        int check = 0;

        for (int i = 2; i <= 100; i++) {
            check +=2;
            num++;
            System.out.printf("num: %d , check: %d\n", num, check);
        }

    }
}
