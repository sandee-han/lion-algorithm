package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KakaoCrain {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        int[] count = new int[board.length];

        // 뽑은 인형 담는 basket 리스트 생성
        ArrayList<Integer> basket = new ArrayList<>();

        int j = 0;

        // 인형 높이 배열 생성(열 순서대로 넣음)
        for (int i = 0; i < board.length; i++) {
            while (true) {
                // board[ 행 j ][ 열 i ]의 값이 0이 아니면 행(j) 위치 넣어줌
                if (board[j][i] != 0) {
                    count[i] = j;
                    break;
                }
                // 값 안들어오면 다음 행으로
                j++;
            }
            // count 들어오면 행은 첫째줄로 초기화, i++해서 다음 열로 넘어감
            j = 0;
        }
        System.out.println("first count: " + Arrays.toString(count));

        // basket의 어디에 담기는지 보여주는 basketCount 사용
        int basketCount = 0;

        // 첫 번째 move로 basket에 값 담아줌
        basket.add(board[count[moves[0] - 1]][moves[0] - 1]);

        // 담긴 인형은 빼줘야 하므로 board를 0으로
        board[count[moves[0] - 1]][moves[0] - 1] = 0;

        // count로 인형의 위치도 증가시켜줌
        count[moves[0] - 1]++;

        System.out.println("second count: " + Arrays.toString(count));

        // 남은 move 전부 수행
        for (int i = 1; i < moves.length - 1; i++) {

            // 인형이 존재하는 경우 (인형의 위치가 board 내부인 경우) 인형뽑기 수행
            if (count[moves[i] - 1] != board.length) {

                // move로 basket에 값 담아줌
                basket.add(board[count[moves[i] - 1]][moves[i] - 1]);

                // 인형이 빠졌으니까 board 0으로
                board[count[moves[i] - 1]][moves[i] - 1] = 0;

                // 인형 위치가 board를 벗어나지 않는 경우에만 count 값 증가시켜줌
                if (count[moves[i] - 1] != board.length) {
                    count[moves[i] - 1]++;
                }

                // 인형이 담기는 바구니 위치 증가
                basketCount++;

                // 현재 위치 이전 위치의 인형 비교해야하므로 바구니 위치가 첫번째인 경우는 비교 패스
                if (basketCount > 0) {

                    // 이전 위치랑 같으면 바구니의 인형 제거
                    if (basket.get(basketCount).equals(basket.get(basketCount - 1))) {
                        basket.remove(basketCount);
                        basket.remove(basketCount - 1);

                        // 바구니 인형 위치도 두칸 뒤로
                        basketCount -= 2;

                        // 뺀 인형의 수 증가
                        answer +=2;
                    }
                }
            }
            System.out.printf("%d 번째 count: " + Arrays.toString(count) + " answer : " + answer + "\n", i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] inputBoard1 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[][] inputBoard2 = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int[] moves2 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        System.out.println(solution(inputBoard2, moves2));
    }
}
