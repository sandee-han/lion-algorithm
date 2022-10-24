package sort;

import java.util.PriorityQueue;

public class KthNumRok {

    private int[] arr = {};

    public int getKthNum(int[] command) {
        int frIdx = command[0]; // 0번 from
        int toIdx = command[1]; // 1번 to
        int nth = command[2];   // n 번째
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx ; i++) {    // 1번부터 시작하니 -1
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll(); // Stack의 pop과 비슷
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
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
