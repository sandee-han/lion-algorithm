package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinaryTree {
    public static int goUp(int a, int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1;
        } else if (a < b) {
            return goUp(a, b / 2) + 1;
        } else return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        System.out.println(goUp(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
    }
}
