package array.multiplearray;

public class MultipleArray {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < answer[0].length; i++) {
            answer[0][i] = arr1[0][i] * arr2[0][i];
        }

        return answer;
    }
}
