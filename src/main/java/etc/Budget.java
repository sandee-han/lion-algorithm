package etc;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(d);

        // 0번 인덱스 부터 하나씩 뺀다
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) { // Budget이 음수가 될때의 인덱스 리턴
                answer = i;
                System.out.println(answer);
                return answer;
            } else if (budget == 0) { // Budget이 0 될때의 인덱스 + 1리턴
                answer = i + 1;
                System.out.println(answer);
                return answer;
            } else { // Budget이 남은 경우 배열 d의 길이 리턴
                answer = d.length;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3};
        Budget budget = new Budget();
        budget.solution(arr, 10);
    }
}
