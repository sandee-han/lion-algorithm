package dynamic;

public class DynamicFibo {
    public static int dynamicRecFibo(int n, int[] memo) {
        if (n <= 1) {
            return n;
        } else if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = dynamicRecFibo(n - 2, memo) + dynamicRecFibo(n - 1, memo);
        return memo[n];
    }

    public static int dynamicFibo(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;

        while (n > 1) {
            memo[n] = memo[n - 1] + memo[n - 2];
            n--;
        }

        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(dynamicFibo(10));
//        System.out.println(dynamicRecFibo(10, new int[45]));
    }
}
