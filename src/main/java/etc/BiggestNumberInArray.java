package etc;

import java.util.Arrays;

public class BiggestNumberInArray {
    public static String solution(int[] numbers) {
        String answer = "";

        // 숫자 배열을 하나의 string으로 결합
        for (int i = 0; i < numbers.length; i++) {
            answer = answer + Integer.toString(numbers[i]);
        }

        // split으로 배열에 넣고 sort
        String[] arrayForSort = answer.split("");
        Arrays.sort(arrayForSort);

        // answer 초기화
        answer = "";

        // sort된 배열 역순으로 answer에 입력
        for (int i = arrayForSort.length - 1; i >= 0; i--) {
            answer = answer + arrayForSort[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
    }
}
