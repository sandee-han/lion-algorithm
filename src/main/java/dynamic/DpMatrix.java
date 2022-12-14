package dynamic;

import java.util.Arrays;

public class DpMatrix {

    public int getMinWay(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i == 0 && j == 0){
                    dp[i][j] = matrix[i][j];
                } else if (i == 0 && j > 0) {
                    dp[i][j] = matrix[i][j - 1] + matrix[i][j];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[matrix.length - 1][matrix[0].length - 1];
    }

    public static void main(String[] args) {
        DpMatrix dpMatrix = new DpMatrix();
        int n = 3;
        int[][] matrix;
        matrix = new int[][]{
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4}
        };

        System.out.println(dpMatrix.getMinWay(matrix));

    }

}
