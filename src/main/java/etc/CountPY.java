package etc;

public class CountPY {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') countP++;
            else if (s.charAt(i) == 'Y') countY++;
        }
        if (countP == countY) return true;
        else return false;
    }
}
