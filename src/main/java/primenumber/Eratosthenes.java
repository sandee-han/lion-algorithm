package primenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosthenes {
    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1]; // 2~50까지 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기

        // 2의 배수 지우기
        // nums[j] + j
        for (int j = 0; j * j <= N; j++) {
            System.out.println(j);
            int multipleOf = nums[j];
            // 초항이 2, 2n 인 2 4 6 8 등차수열
            for (int i = nums[j] + j; i < nums.length; i+=multipleOf) {
                checks[i] = false;
            }
       }

        // checks를 참고해서 true인 친구들만 nums[checks[i]]만 출력
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(checks[i] == true) {
                System.out.printf("%d\t", nums[i]);
                cnt++;
            }
        }
        System.out.printf("\n%d", cnt);



        // List
//        List<Integer> primes = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(checks[i] == true) primes.add(nums[i]);
//        }
//        System.out.println(primes);

    }
}
