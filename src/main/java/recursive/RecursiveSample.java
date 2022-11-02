package recursive;

public class RecursiveSample {
    int MemoizationFibonacci(int k) {
        return MemoizationFibonacci(k, new int[k+1]);
    }

    int MemoizationFibonacci(int k, int[] cache) {
        if (k <= 1) {
            return k;
        } else if (cache[k] > 0) {
            return cache[k];
        }
        cache[k] = MemoizationFibonacci(k - 2, cache) + MemoizationFibonacci(k - 1, cache);

        return cache[k];
    }

    int TabulationFibonacci(int k) {
        if (k <= 1) {
            return k;
        }

        int first = 1;
        int second = 0;
        int result = 0;

        for (int i = 1; i < k; i++) {
            result = first + second;
            second = first;
            first = result;
        }
        return result;
    }

}
