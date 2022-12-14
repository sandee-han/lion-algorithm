package pccp1;

import java.util.*;

public class LonerAlphabet {
    public static String solution(String input_string) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> countMap = new HashMap<>();
        Queue<Character> queue = new PriorityQueue<>();

        for (int i = 0; i < input_string.length(); i++) {
            countMap.put(input_string.charAt(i), countMap.getOrDefault(input_string.charAt(i), 0) + 1);
        }

        // input_String 에 중복되는 문자가 없는 경우
        int checkOneLetter = 0;
        for (Integer value : countMap.values()) {
            if (value == 1) {
                checkOneLetter++;
            } else {
                break;
            }
        }
        if (checkOneLetter == input_string.length()) return "N";


        int checkCount = 1;

        while (input_string.length() != checkCount) {
            if (input_string.charAt(0) != input_string.charAt(checkCount)) {
                if (countMap.get(input_string.charAt(0)) == checkCount) {
                    input_string = input_string.replace(String.valueOf(input_string.charAt(0)), "");
                    checkCount = 1;
                } else if (countMap.get(input_string.charAt(0)) != 1) {
                    queue.add(input_string.charAt(0));
                    System.out.printf("remove char: %c\n", input_string.charAt(0));
                    input_string = input_string.replace(String.valueOf(input_string.charAt(0)), "");
                    System.out.printf("sb: %s\n", sb);
                    System.out.printf("input_String: %s\n\n", input_string);
                    checkCount = 1;
                }
            } else {
                checkCount++;
            }

        }

        for (Character character : queue) {
            sb.append(character);
        }

        String answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        String input1 = "zbzbz";
        System.out.println(solution(input1));
    }
}
