package leetcode;

import java.util.Arrays;

public class StringCompression {
    public static int compress(char[] chars) {
        int count = 1;

        StringBuilder sb = new StringBuilder();

        sb.append(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else if (count == 1) {
                sb.append(chars[i + 1]);
            } else {
                sb.append(count);
                sb.append(chars[i + 1]);
                count = 1;
            }
        }

        sb.append(count);

        System.out.println(sb);

        char[] result = sb.toString().toCharArray();
        return result.length;
    }

    public static int compress2(char[] chars) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        sb.append(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else if (count == 1) {
                sb.append(chars[i + 1]);
            } else {
                sb.append(count);
                sb.append(chars[i + 1]);
                count = 1;
            }
        }

        sb.append(count);
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        System.out.println(Arrays.toString(chars));
        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress2(chars));
//        char[] chars2 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//        System.out.println(compress2(chars2));
    }

}
