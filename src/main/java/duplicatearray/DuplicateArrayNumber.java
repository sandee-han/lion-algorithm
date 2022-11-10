package duplicatearray;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateArrayNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        Queue<Integer> que = new LinkedList<>();

        //  arr[0] 그냥 넣고
        que.offer(arr[0]);

//        // arr[1] 넣기전 이전 값과 동일한지 확인
//        if (arr[1] != arr[0]) que.offer(arr[1]);
//
//        // arr[2] 넣기 전 이전 값과 동일한지 확인
//        if (arr[2] != arr[1]) que.offer(arr[2]);

        // for문으로 정리
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) que.offer(arr[i]);
        }

        Iterator iter = que.iterator();

        System.out.println("[");
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println("]");
    }

}

