package matrix.multiplematrix;

public class MultipleArray {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int j = 0; j < answer.length; j++) {
            for (int i = 0; i < answer[j].length; i++) {

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        MultipleArray multipleArray = new MultipleArray();
        multipleArray.solution(arr1, arr2);
    }
}
