package array.arrayandstring;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        char tmp;
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }

    public static void reverseString2(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char tmp;
        while (left < right) {
            tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverseString(input);
    }
}
