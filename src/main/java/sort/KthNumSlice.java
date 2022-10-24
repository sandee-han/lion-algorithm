package sort;

import java.util.Arrays;

public class KthNumSlice {
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {

            // array를 slice
            int[] slicedArr = Arrays.copyOfRange(arr, command[0] - 1, command[1]);

            // array를 정렬
            Arrays.sort(slicedArr);

            // 정렬된 array의 idx번째를 뽑음
            answer[idx++] = slicedArr[command[2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNumSlice kns = new KthNumSlice();
        System.out.println(Arrays.toString(kns.solution(arr, commands)));
    }
}
