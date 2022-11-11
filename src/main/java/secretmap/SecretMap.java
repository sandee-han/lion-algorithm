package secretmap;

import java.util.Arrays;

public class SecretMap {

    /*
    a1, b1 숫자를 이진수로 변환

    무려 비트연산자 or가 있었다.

     */

    public String convertToBinary(int num) {
        String binaryNum = Integer.toBinaryString(num);

        // 이진수 자릿수 해결
        while(binaryNum.length() < 5) {
            binaryNum = "0" + binaryNum;
        }
        return binaryNum;
    }

    public String convertToBinaryDiy(int num) {
        String binaryNum = "";
        while(num > 0) {
            binaryNum = Integer.toString(num % 2) + binaryNum;
            num /= 2;
        }
        while(binaryNum.length() < 5) {
            binaryNum = "0" + binaryNum;
        }
        return binaryNum;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            while(answer[i].length() < n) {
                answer[i] = "0" + answer[i];
            }
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMap sm = new SecretMap();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        sm.solution(5, arr1, arr2);

    }

}
