package primenumber;

import java.util.Arrays;

public class EratosthenesReview {
    public static void main(String[] args) {
        int N = 50;
        // 배열 크기 2 부터 50까지 49
        int[] arr = new int[N - 1];
        boolean[] check = new boolean[arr.length];
        Arrays.fill(check, true);
        // arr 에 2부터 50까지 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }

        for(int j = 2; j * j < N; j++) {
            for (int i = j; i < N - 1; i++) {
                if (arr[i] % j == 0) {
                    check[i] = false;
                    arr[i] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(check));
    }
}
