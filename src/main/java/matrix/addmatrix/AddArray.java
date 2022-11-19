package matrix.addmatrix;

import java.util.Arrays;

public class AddArray {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                answer[j][i] = arr1[j][i] + arr2[j][i];
            }
        }
        System.out.println(Arrays.deepToString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        AddArray addArray = new AddArray();
        addArray.solution(arr1, arr2);
    }
}
