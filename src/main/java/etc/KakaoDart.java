package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KakaoDart {
    public int solution(String dartResult) {
//        결국 수식을 만드는 과정
//
//        숫자형 앞에는 `+`가 붙는다.
//
//        → 그러면 숫자형으로 수식을 하나씩 끊고 계산식을 3개 만들면?
//
//        → 계산식 1개당 list 하나
        // list 담는 arr 생성

        int answer = 0;

        List<Character>[] arr = new ArrayList[3];

        // 이차원 배열 선언 시 for문으로 idx별 list를 선언해야한다.
        for (int i = 0; i < 3; i++) {
            arr[i] = new ArrayList<>();
        }
        // 배열 첫번째 값(숫자) 넣고 시작
        int i = 0;
        for (int j = 0; j < 3; j++) {
            arr[j].add(dartResult.charAt(i));
            i++;
            // 아스키 값이 숫자가 아닌 동안 arr에 입력

            while((int)dartResult.charAt(i) > 58 || (int)dartResult.charAt(i) < 47) {
                arr[j].add(dartResult.charAt(i));
                i++;
                if(i >= dartResult.length()) break;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        return answer;
    }

    public static void main(String[] args) {
        KakaoDart kakaoDart = new KakaoDart();
        String test1 = "1S2D*3T";

        kakaoDart.solution(test1);

    }
}
