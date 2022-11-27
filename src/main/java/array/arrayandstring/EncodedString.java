package array.arrayandstring;

import java.util.Arrays;

public class EncodedString {
    public static char[] encoding(char[] str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            sb.append(c);
        }
        String input = sb.toString();
        input = input.replaceAll(" ", "%20");
        char[] encodedStr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            encodedStr[i] = input.charAt(i);
        }
        return encodedStr;
    }

    public static void main(String[] args) {
        char[] str = "  String  with spaces  ".toCharArray();
        str = encoding(str);
        System.out.println(Arrays.toString(str));

    }
}
