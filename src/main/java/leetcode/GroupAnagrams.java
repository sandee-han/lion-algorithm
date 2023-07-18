package leetcode;

import java.util.*;

public class GroupAnagrams {

    // 230418 트라이
    public List<List<String>> groupAnagrams2(String[] strs) {
        int[][] strsInt = new int[strs.length][strs[0].length()];

        for (int j = 0; j < strs.length; j++) {
            for (int i = 0; i < strs[0].length(); i++) {
                strsInt[j][i] = strs[0].charAt(i);
            }
        }

        return null;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] tempStrs = new String[strs.length];
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] forSort = strs[i].toCharArray();
            Arrays.sort(forSort);
            tempStrs[i] = new String(forSort);
        }


        return null;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> output = groupAnagrams(strs);

        for (List<String> strings : output) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
}
