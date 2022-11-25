package gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gcd {
    public static int Gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else if (a < b) {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(Gcd(a, b));
    }
}
