package harshadnumber;

public class Diy {
    public static void main(String[] args) {
        // 1. 자릿수 나누고 값 더하기
        // 2. 더한 값 나누기
        int x = 1222;
        int sum = 0;
        int cnt = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
    }
}
