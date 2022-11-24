package recursive;

public class Fibonacci2 {
    public static int fib(int n) {
        // n 이 1이나 2가 들어오면 재귀를 안타고 return
        if (n == 1 || n == 2 ) return 1; // n이 1일 때 1, 2일 때 2
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        if(n <= 1) return n;
        return fib2(n - 2) + fib2(n - 1);
    }

    public static void main(String[] args) {
        int r = fib(6);
        System.out.println(r);
    }
}
