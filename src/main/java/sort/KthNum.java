package sort;

import java.util.PriorityQueue;

public class KthNum {

    private int[] arr = {};

    public int getKthNum(int[] command) {
        int fromIdx = command[0];
        int toIdx = command[1];
        int nIdx = command[2];
        int result = 0;
        PriorityQueue<Integer> prq = new PriorityQueue<>();
        for(int i = fromIdx -1; i < nIdx; i++) {
            prq.add(arr[i]);
        }

        for(int i = 0; i < nIdx; i++) {
            result = prq.poll();
        }

        return result;
    }

    public int[] solution(int[] array, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        KthNumRok kthNumRok = new KthNumRok();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        kthNumRok.solution(arr, commands);
    }
}
