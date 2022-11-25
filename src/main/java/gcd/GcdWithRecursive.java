package gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GcdWithRecursive {
    public static int[] GcdRecursive(int[] inputArr) {
        if (inputArr[0] > inputArr[1]) {
            inputArr[0] = inputArr[0] - inputArr[1];
        } else if (inputArr[0] < inputArr[1]) {
            inputArr[1] = inputArr[1] - inputArr[0];
        } else {
            Arrays.sort(inputArr);
            return inputArr;
        }
        return GcdRecursive(inputArr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] inputArr = {Integer.parseInt(input[0]), Integer.parseInt(input[1])};
        inputArr = GcdRecursive(inputArr);
        System.out.println(inputArr[0]);
    }
}
