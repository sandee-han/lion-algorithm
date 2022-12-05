package heap;

import java.util.Arrays;

public class MakeHeap {
    public static int[] showChildrenIdx(int parentIdx) {
        int[] sorted = new int[2];
        sorted[0] = parentIdx * 2 + 1;
        sorted[1] = parentIdx * 2 + 2;
        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};

        int tmp = arr[1];
        arr[1] = arr[3];
        arr[3] = tmp;

        tmp = arr[1];
        arr[1] = arr[0];
        arr[0] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}
