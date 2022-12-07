package heap;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static int mix(int[] arr, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : arr) {
            priorityQueue.add(i);
        }
        int min = 0;
        int first;
        int second;
        int count = 0;

        while (priorityQueue.peek() < K && priorityQueue.size() > 1) {
            first = priorityQueue.poll();
            second = priorityQueue.poll();
            min = first + (second * 2);
            priorityQueue.add(min);
            count++;
        }
        if (priorityQueue.size() == 1 && priorityQueue.peek() < K) {
            System.out.println(priorityQueue.peek());
            return -1;
        }
        return count;

//        for (int i = 0; i < arr.length - 1; i++) {
//            first = priorityQueue.poll();
//            second = priorityQueue.poll();
//            min = first + (second * 2);
//            if (min > k) {
//                return i + 1;
//            } else {
//                priorityQueue.add(min);
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(mix(arr, 11));
    }
}
