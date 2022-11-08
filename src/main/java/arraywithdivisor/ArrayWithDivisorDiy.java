package arraywithdivisor;

import java.util.*;

public class ArrayWithDivisorDiy {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.isEmpty()) {
            list.add(-1);
        } else {
            Collections.sort(list);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        int[] answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7 ,10};
        List<Integer> list = new ArrayList<>();
        int divisor = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.isEmpty()) {
            list.add(-1);
        } else {
            Collections.sort(list);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
    }
}
