package recursive;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    int count(int num) {
        if(num == 1 || num == 2) {
            return 1;
        }
        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for (int i = 2; i < num; i++) {
            fibonacciNums.add(fibonacciNums.get(i - 1) + fibonacciNums.get(i - 2));
        }
        return fibonacciNums.get(num - 1);
    }

    int[] countWithoutRec(int num) {
        int[] arr = new int[num];
        if (num == 1) {
            arr[0] = 1;
            return arr;
        }

        if (num == 2) {
            arr[0] = 1;
            arr[1] = 1;
            return arr;
        }
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
