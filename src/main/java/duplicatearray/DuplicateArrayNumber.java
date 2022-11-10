package duplicatearray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateArrayNumber {

    public int[] solution(int []arr) {

        Queue<Integer> que = new LinkedList<>();

        que.offer(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) que.offer(arr[i]);
        }
        int[] answer = new int[que.size()];

        for (int i = 0; i < que.size(); i++) {
            System.out.print(que.peek() + " ");
            answer[i] = que.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        DuplicateArrayNumber dan = new DuplicateArrayNumber();
        System.out.println(Arrays.toString(dan.solution(arr)));

    }

}

