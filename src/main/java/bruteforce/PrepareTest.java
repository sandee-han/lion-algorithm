package bruteforce;

import java.util.Arrays;

public class PrepareTest {
        public int[] solution(int[] answers) {
            /*
            1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
            2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
            3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

            1. 공간복잡도로 속도 높이는 방법
            -> Compare with String

            2. 나머지를 이용하는 방법
            -> Array

             */
            int[][] students = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

            int[] memo = {0, 0, 0};

            for (int i = 0; i < answers.length; i++) {
                for (int j = 0; j < memo.length; j++) {
                    if (answers[i] == students[j][i % students[j].length]) memo[j] += 1;
                }
            }
            System.out.println(Arrays.toString(memo));
            
            return new int[0];
        }


    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};
        int[] answer2 = {1, 3, 2, 4, 2};

        PrepareTest prepareTest = new PrepareTest();
        prepareTest.solution(answer);
    }
}
