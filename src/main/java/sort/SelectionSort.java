package sort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

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

    public int[] selectionSortAscBiFunction(int[] arr, BiFunction<Integer, Integer, Boolean> bf) {
        int tmp = 0;
        System.out.println("selectionSort with BiFunction");
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (bf.apply(arr[minIdx], arr[j])) minIdx = j;
            }
            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public int[] selectionSortAscFunction(int[] arr, Function<int[], Boolean> func) {
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (func.apply(arr)) minIdx = j;
            }
            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort ss = new SelectionSort();
        ss.selectionSortAscFunction(arr, (arr1) -> arr1[0] > arr1[1]);

//        ss.selectionSortAsc(arr, (a, b) -> a > b);

//        ss.selectionSortAscBiFunction(arr, (a, b) -> a > b);

        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));

//        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
    }
}
