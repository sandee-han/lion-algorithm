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

    public static void main(String[] args) {

    }
}
