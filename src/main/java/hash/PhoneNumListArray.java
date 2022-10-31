package hash;

import java.util.HashSet;

public class PhoneNumListArray {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/42577

    1. indexOf 로 배열 하나하나 비교? -> 너무 느려진다. 배열 단순 사용은 어려움

    2.

     */

    public boolean solution(String[] nums) {
        HashSet<String> hs = new HashSet<>();
        for (String num : nums) hs.add(num);




        return false;
    }

    public static void main(String[] args) {
        PhoneNumListArray pn = new PhoneNumListArray();

        String[] t1 = {"119", "97674223", "1195524421"};
        String[] t2 = {"123","456","789"};


        System.out.println(pn.solution(t2));
    }

}
