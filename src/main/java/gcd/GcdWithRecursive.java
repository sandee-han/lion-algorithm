package gcd;

import java.util.Arrays;

public class GcdWithRecursive {
    public static int[] Gcd(int[] inputArr) {
        if (inputArr[0] > inputArr[1]) {
            inputArr[0] = inputArr[0] - inputArr[1];
        } else if (inputArr[0] < inputArr[1]) {
            inputArr[1] = inputArr[1] - inputArr[0];
        } else {
            return inputArr;
        }
        return Gcd(inputArr);
    }



    public static void main(String[] args) {
        int[] input = {196, 42};
        System.out.println(Arrays.toString(Gcd(input)));
    }
}
