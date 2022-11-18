package etc;

import java.util.Arrays;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        int[] arr = new int[s.length()];

        // 대문자 구분 ascii 65 ~ 90
        if((int)s.charAt(0) > 64 && (int)s.charAt(0) < 91) {
            if((int)s.charAt(0) + n > 90) {
                arr[0] = (int)s.charAt(0) + n - 26;
            } else {
                arr[0] = ((int)s.charAt(0) + n);
            }
        }

        // 소문자 구분
        if((int)s.charAt(0) > 96 && (int)s.charAt(0) < 123) {
            if((int)s.charAt(0) + n > 123) {
                arr[0] = (int)s.charAt(0) + n - 26;
            } else {
                arr[0] = ((int)s.charAt(0) + n);
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
