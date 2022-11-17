package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KakaoDart {
    public int solution(String dartResult) {
        int answer = 0;
        return answer;
    }

    public int solutionFailed(String dartResult) {
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

        int i = 0;
        for (int j = 0; j < 3; j++) {
            // 배열 첫번째 값(숫자) 넣고 시작
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

        // 수식 계산

        // 각 수식 별 결과값 저장
        int[] result = new int[3];

        for (int j = 0; j < 3; j++) {
            // 1. list의 첫번째는 int로 변환
            result[j] = Character.getNumericValue(arr[j].get(0));

            // 2. 문자: S: ^1, D: ^2, T: ^3 으로
            switch (arr[j].get(1)) {
                case 'S' :
                    break;
                case 'D' :
                    result[j] = (int)Math.pow(result[j], 2);
                    break;
                case 'T' :
                    result[j] = (int)Math.pow(result[j], 3);
                    break;
            }
            // 3. 뽀나리: #: *(-1), *: *2
            if(arr[j].size() == 3) {
                switch (arr[j].get(2)) {
                    case '#' :
                        result[j] = result[j] * (-1);
                        break;
                    case '*' :
                        result[j] = result[j] * 2;

                        // * 는 바로 앞 list까지 *2 해준다.
                        if(j > 0) {
                            result[j - 1] = result[j - 1] * 2;
                        }
                        break;
                }
            }
        }

        for (int i1 : result) {
            answer += i1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        KakaoDart kakaoDart = new KakaoDart();
        String test1 = "1S2D*3T";
        String test2 = "1D2S#10S";
        String test3 = "1D#2S*3S";

        kakaoDart.solution(test1);
        kakaoDart.solution(test2);
        kakaoDart.solution(test3);

    }
}
