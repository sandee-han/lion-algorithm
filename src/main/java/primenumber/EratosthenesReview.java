package primenumber;

import java.util.Arrays;

public class EratosthenesReview {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1];
        boolean[] check = new boolean[arr.length];
        Arrays.fill(check, true);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }

        for (int i = 1; i < N - 1; i++) {
            if (arr[i] % 2 == 0) {
                check[i] = false;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(check));
    }
}
