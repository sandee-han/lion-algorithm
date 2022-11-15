package sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        List<Integer> gatherList = new ArrayList<>();

        // 1. 기준값 뽑는 로직
        int pivot = arr.length / 2;

        // 2. 기준값 기준으로 왼쪽, 오른쪽 나누어 담는 로직 구현
        // 이렇게 넣으면 pivot인덱스는 어떻게 리스트에서 빼는가
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[pivot]) {
                leftList.add(arr[i]);
            } else {
                rightList.add(arr[i]);
            }
        }

        gatherList.addAll(leftList);
        gatherList.addAll(rightList);

        System.out.println(arr[pivot]);
        System.out.println(leftList.toString());
        System.out.println(rightList.toString());

        // hint: list
    }
}
