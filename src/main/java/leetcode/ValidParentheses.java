package leetcode;

public class ValidParentheses {
    public static boolean isValid(String s) {
        int[] check = new int[3];

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                check[0]++;
            } else if (s.charAt(i) == ')') {
                check[0]--;
            } else if (s.charAt(i) == '[') {
                check[1]++;
            } else if (s.charAt(i) == ']') {
                check[1]--;
            } else if (s.charAt(i) == '{') {
                check[2]++;
            } else if (s.charAt(i) == '}') {
                check[2]--;
            }

            if (check[0] < 0 || check[1] < 0 || check[2] < 0) {
                return false;
            }
        }

        if (check[0] == 0 && check[1] == 0 && check[2] == 0) {
            return true;
        }

        return false;
    }

    public static boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);

        int checkLength;

        while (sb.length() > 0) {
            checkLength = sb.length();
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i) == ')') {
                    if (sb.charAt(i - 1) == '(') {
                        sb.delete(i - 1, i + 1);
                        i = 0;
                    } else {
                        return false;
                    }
                } else if (sb.charAt(i) == '}') {
                    if (sb.charAt(i - 1) == '{') {
                        sb.delete(i - 1, i + 1);
                        i = 0;
                    } else {
                        return false;
                    }
                } else if (sb.charAt(i) == ']') {
                    if (sb.charAt(i - 1) == '[') {
                        sb.delete(i - 1, i + 1);
                        i = 0;
                    } else {
                        return false;
                    }
                }
                System.out.println(sb);
            }
            if (sb.length() == checkLength) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s1 = "[({(())}[()])]";
        String s2 = "()[]{}";
        String s3 = "([)]";

        System.out.println(isValid2(s1));
//        System.out.println(isValid2(s2));
//        System.out.println(isValid2(s3));
    }
}
