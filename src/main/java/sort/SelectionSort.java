package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int tmp = 0;
        int i = 0;
        // arr[0] 번째에 들어갈 값 찾기
        // 그 값이 들어있는 index 찾기 -- 0
        int minIdx = i;
        for (int j = i; j < arr.length; j++) {
            if (arr[i] > arr[j]) minIdx = j;
        }
        tmp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = tmp;
        System.out.println(Arrays.toString(arr));

        i = 1;
        // arr[0] 번째에 들어갈 값 찾기
        // 그 값이 들어있는 index 찾기 -- 8
        minIdx = 0;

        i = 2;
        // arr[0] 번째에 들어갈 값 찾기
        // 그 값이 들어있는 index 찾기 --
        minIdx = 0;

        i = 3;
        // arr[0] 번째에 들어갈 값 찾기
        // 그 값이 들어있는 index 찾기 -- 8
        minIdx = 0;

    }
}
