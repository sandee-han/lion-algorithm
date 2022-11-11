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

        return binaryNum;
    }

    public static void main(String[] args) {
        SecretMap sm = new SecretMap();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[][] compare = new String[5][5];
        
        String binaryNum1 = sm.convertToBinary(arr1[0]);
        String binaryNum2 = sm.convertToBinary(arr2[0]);
        String[] binaryNumArr1 = binaryNum1.split("");
        String[] binaryNumArr2 = binaryNum2.split("");



        for (int i = 0; i < n; i++) {
            if (binaryNumArr1[i].equals("1") || binaryNumArr2[i].equals("1")) {
                compare[0][i] = "3" + compare[0][i];
            }
        }

        
        
        
        int[] binaryNumArrInt
        for (int i = 0; i < binaryNumArr.length; i++) {
            
        }
        

        System.out.println(sm.convertToBinaryDiy(9));
        System.out.println(sm.convertToBinary(9));


    }

}
