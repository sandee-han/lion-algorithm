package sort;

import java.util.*;

public class RadixSort {
    public static int[] radixOne(int[] arr) {
        int[] indexArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            indexArr[arr[i]] = arr[i];
        }
        int count = 1;
        arr[0] = 0;
        for (int i = 0; i < indexArr.length; i++) {
            if (indexArr[i] != 0) {
                arr[count] = indexArr[i];
                count++;
            }
        }
        return arr;
    }

    public static int[] radixTwo(int[] arr) {
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }
        for (int i = 0; i < arr.length; i++) {
            int digit = (int)Math.pow(10, 0);
            queueArr[Math.floorDiv(arr[i], digit) % 10].add(arr[i]);
        }
        return new int[10];
    }


    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};
        int[] sorted = radixOne(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
