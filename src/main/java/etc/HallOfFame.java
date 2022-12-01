package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        if (k > score.length) {
            for (int i = 0; i < score.length; i++) {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }
            return answer;
        }
        // 3까지 입력 후
        for (int i = 0; i < k; i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        // k 이후
        for (int i = k; i < score.length; i++) {
            // 입력 값이 제일 작은 값보다 클 경우
            if (score[i] > list.get(0)) {
                // 제일 작은 값 제거
                list.remove(0);
                // 입력값 리스트에 넣고
                list.add(score[i]);
                // sort
                Collections.sort(list);
                // answer에 값 추가
                answer[i] = list.get(0);
            } else {
                answer[i] = list.get(0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] input1 = {10, 100, 20, 150, 1, 100, 200};
        int[] input2 = {1, 2, 3};
        System.out.println(Arrays.toString(solution(5, input2)));
    }
}
