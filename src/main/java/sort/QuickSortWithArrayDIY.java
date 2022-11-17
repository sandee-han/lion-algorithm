package sort;

import java.util.Arrays;

public class QuickSortWithArrayDIY {
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        int tmp;

        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx += 1;
            while (arr[rightIdx] > pivot) rightIdx -= 1;

            tmp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = tmp;
            leftIdx += 1;
            rightIdx -= 1;

            System.out.println(Arrays.toString(arr));
        }

    }
}
