package etc;

import java.util.Arrays;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            // 대문자 구분 ascii 65 ~ 90
            if((int)s.charAt(i) > 64 && (int)s.charAt(i) < 91) {
                if((int)s.charAt(i) + n > 90) {
                    arr[i] = (int)s.charAt(i) + n - 26;
                } else {
                    arr[i] = ((int)s.charAt(i) + n);
                }
            }

            // 소문자 구분
            if((int)s.charAt(i) > 96 && (int)s.charAt(i) < 123) {
                if((int)s.charAt(i) + n > 123) {
                    arr[i] = (int)s.charAt(i) + n - 26;
                } else {
                    arr[i] = ((int)s.charAt(i) + n);
                }
            }
        }

        System.out.println(Arrays.toString(arr));



        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String input = "A B z";
        int num = 1;

        caesarCipher.solution(input, num);
    }
}
