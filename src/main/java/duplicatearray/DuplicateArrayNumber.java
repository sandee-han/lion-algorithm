package duplicatearray;

import java.util.*;

public class DuplicateArrayNumber {

    public int[] solutionWithQueue(int []arr) {

        Queue<Integer> que = new LinkedList<>();

        que.offer(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) que.offer(arr[i]);
        }
        int[] answer = new int[que.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = que.poll();
        }

        return answer;
    }

    public int[] solutionWithStack(int []arr) {

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.peek();
            stack.pop();
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        DuplicateArrayNumber dan = new DuplicateArrayNumber();
//        int[] test = dan.solutionWithQueue(arr);
        int[] testStack = dan.solutionWithStack(arr);
        System.out.println(Arrays.toString(testStack));

    }

}

