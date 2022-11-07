package harshadnumber;

public class Diy {
    public static void main(String[] args) {
        // 1. 자릿수 나누고 값 더하기
        // 2. 더한 값 나누기
        int x = 12;
        int check = x;
        int sum = 0;
        boolean answer;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        if(check % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(sum);
        System.out.println(answer);
    }
}
