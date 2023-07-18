package leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        String removeBlankS = s.replaceAll(" ", "");
        StringBuilder compareS = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((lowerS.charAt(i) > 47 && lowerS.charAt(i) < 58) || (lowerS.charAt(i) > 96 && lowerS.charAt(i) < 123)) {
                compareS.append(lowerS.charAt(i));
            }
        }

        System.out.println("compareS: " + compareS.toString());

        int start = 0;
        int end = compareS.length() - 1;

        while(start <= (compareS.length() / 2)) {
            if (compareS.charAt(start) != compareS.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
    }
}
