package heap;

import java.util.Arrays;

public class MakeHeap3 {
    public static int[] makeHeap(int[] arr, int parentIdx, int arrSize) {
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        // 왼쪽이 parent보다 크면 greateridx=leftIdx 6 7 5 --> 7 6 5
        if (leftIdx < arrSize && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        //오른쪽 자식이 greater 보다 크면
        if (rightIdx < arrSize && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        // swap
        if (parentIdx != greaterIdx) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
            makeHeap(arr, greaterIdx, arrSize);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        arr = new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7};
        for (int i = (arr.length - 2) / 2; i > 0; i--) {
            makeHeap(arr, i, arr.length);
            System.out.println(Arrays.toString(arr));
        }
    }
}

