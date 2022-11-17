package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortWithArray {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx + endIdx) / 2];
        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int tmp;

        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx += 1;
            while (arr[rightIdx] > pivot) rightIdx -= 1;

            if(leftIdx<=rightIdx) {
                tmp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = tmp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }
        if(startIdx < rightIdx) sort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        QuickSortWithArray quickSortWithArray = new QuickSortWithArray();
        System.out.println(Arrays.toString(quickSortWithArray.sort(arr, 0, arr.length -1)));
    }
}
