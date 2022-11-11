package secretmap;

import java.util.Arrays;

public class SecretMap {

    /*
    a1, b1 숫자를 이진수로 변환

    a1, b1 배열로 변환

    숫자 한 자리씩 || 처리 - 오래걸릴거같다

     ~ an, bn 까지 동일하게 || 처리

     1인 경우 #, 0인 경우 " " 출력

     */

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String numBinary = Integer.toBinaryString(arr1[0]);
        String[] arr1Binary = numBinary.split("");

        System.out.println(Arrays.toString(arr1Binary));
        // 자릿수가 모자라면 어떻게 채우는가



    }

}
