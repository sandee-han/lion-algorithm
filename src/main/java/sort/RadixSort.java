package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RadixSort {
    public static int[] radix(int[] arr) {
        int[] indexArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            indexArr[arr[i]] = arr[i];
        }
        return indexArr;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};
        int[] sorted = radix(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
