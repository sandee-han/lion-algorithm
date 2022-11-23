package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintN {
    int print(int num, int count) {
        if (count == num) return 0;
        System.out.print("*");
        return print(num, count + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        PrintN printN = new PrintN();
        printN.print(input, 0);
    }
}
