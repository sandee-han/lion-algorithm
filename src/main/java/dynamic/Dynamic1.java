package dynamic;

public class Dynamic1 {
    public static int dynamicFibo(int n, int[] memo) {
        if (n <= 1) {
            return n;
        } else if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = dynamicFibo(n - 2, memo) + dynamicFibo(n - 1, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(dynamicFibo(10, new int[45]));
    }
}
