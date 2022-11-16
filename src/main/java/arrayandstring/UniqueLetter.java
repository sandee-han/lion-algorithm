package arrayandstring;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 배열고 ㅏ문자열 10.2.1 - 고유문자1
public class UniqueLetter {
    private static final int MAX_CODE = 65535;

    public boolean isUnique1(String str) {
        String noBlankStr = str.replace(" ", "");
        int[] arr = new int[noBlankStr.length()];
        for (int i = 0; i < noBlankStr.length(); i++) {
            arr[i] = (int)noBlankStr.charAt(i);
        }
        // stream을 이용한 중복제거 후 배열 길이 비교
        int[] resultArr = Arrays.stream(arr).distinct().toArray();
        if (arr.length == resultArr.length) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isUnique2(String str) {
        String noBlankStr = str.replace(" ", "");
        Integer[] arr = new Integer[noBlankStr.length()];
        for (int i = 0; i < noBlankStr.length(); i++) {
            arr[i] = (int)noBlankStr.charAt(i);
        }
        // set으로 변환 후 사이즈 비교
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        if (arr.length == set.size()) {
            return true;
        } else {
            return false;
        }
    }

}
