package array.arrayandstring;

import java.util.HashSet;
import java.util.Set;

public class MakeSameString {
    public static boolean isOneEditAway(String q, String p) {
        Set<Character> set = new HashSet<>();
        // set에 q char 넣음
        for (int i = 0; i < q.length(); i++) {
            set.add(q.charAt(i));
        }
        // set에 p char 넣음
        for (int i = 0; i < p.length(); i++) {
            set.add(p.charAt(i));
        }

        // 더 짧은 값을 빼야하므로 q, p 중 짧은 것 저장
        int shoterString = 0;
        if (q.length() <= p.length()) {
            shoterString = q.length();
        }
        else {
            shoterString = p.length();
        }

        // (중복 제거된 set 의 길이 - 짧은 문자열) 이 1보다 작거나 같으면 문자열은 동일하거나 1개의 값만 차이난다.
        if (set.size() - shoterString <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String q = "가나라";
        String p = "가나다";
//        System.out.println(isOneEditAway(q, p));
        System.out.println("tank, tanc: " + isOneEditAway("tank", "tanc"));
        System.out.println("tnk, tank: " + isOneEditAway("tnk", "tank"));
        System.out.println("tank, tinck: " + isOneEditAway("tank", "tinck"));
        System.out.println("tank, tankist: " + isOneEditAway("tank", "tankist"));
    }
}
