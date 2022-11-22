package etc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RemoveMinNum {
    public int[] solution(int[] arr) {
        // arr 값이 1개일 경우 {-1} 리턴
        if (arr.length == 1) return new int[] {-1};

        // answer는 arr에서 최소값이 제거된 길이
        int[] answer = new int[arr.length - 1];

        Map<Integer, Integer> map = new HashMap<>();
        // Map에 key: index, value: 값 으로 arr 대입
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        // arr 오름차순 정렬
        Arrays.sort(arr);

        // map에 최소값이 있는 0번 인덱스 제거
        map.values().remove(arr[0]);

        int count = 0;

        // answer에 map의 value 복사
        for (Integer value : map.values()) {
            answer[count] = value;
            count++;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        RemoveMinNum removeMinNum = new RemoveMinNum();
        removeMinNum.solution(arr);
    }
}
