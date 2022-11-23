package array.arrayandstring;

import java.util.*;

public class UniqueLetterArray {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) sb.append(s.charAt(i));
        }
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        System.out.println(answer);
        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) set.add(s.charAt(i));
        }
        answer = set.toString();
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        UniqueLetterArray uniqueLetterArray = new UniqueLetterArray();
        uniqueLetterArray.solution2("hello");
    }
}
