package harshadnumber;

public class Diy {

    class Solution {
        public boolean solution(int x) {
            int check = x;
            int sum = 0;

            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }

            if(check % sum == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
