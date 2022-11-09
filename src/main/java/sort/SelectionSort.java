package sort;

import java.util.Arrays;

interface StatementStrategy {
    boolean apply(int a, int b);
}

public class SelectionSort {

    public int[] selectionSortDesc(int[] arr, StatementStrategy stmt) {
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) minIdx = j;
            }
            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public int[] selectionSortAsc(int[] arr, StatementStrategy stmt) {
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) minIdx = j;
            }
            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort ss = new SelectionSort();
        ss.selectionSortAsc(arr, (a, b) -> a > b);
    }
}
