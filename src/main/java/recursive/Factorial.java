package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    int multiple(int num) {
        if (num == 1) return 1;
        num = num * (multiple(num - 1));
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        Factorial factorial = new Factorial();
        int result = factorial.multiple(input);
        System.out.println(result);
    }
}
