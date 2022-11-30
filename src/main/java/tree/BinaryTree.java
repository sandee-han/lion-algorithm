package tree;

import java.util.Arrays;

public class BinaryTree {
    public static int goUp(int a, int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1;
        } else if (a < b) {
            return goUp(a, b / 2) + 1;
        } else return 0;
    }
    public static void main(String[] args) {
        System.out.println(goUp(9, 4));
    }
}
