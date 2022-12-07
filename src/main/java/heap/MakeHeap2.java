package heap;

import java.util.Arrays;

public class MakeHeap2 {
    public static int[] makeHeap(int[] arr, int parentIdx) {
        int[] sorted = new int[2];
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        // 왼쪽이 자식 parent보다 크면 greaterIdx = leftIdx
        if(leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]){
            greaterIdx = leftIdx;
        }

        // 오른쪽 자식이 parent 보다 크면
        if(rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]){
            greaterIdx = rightIdx;
        }

        // swap
        int tmp = arr[parentIdx];
        arr[parentIdx] = arr[greaterIdx];
        arr[greaterIdx] = tmp;

        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};

    }
}
