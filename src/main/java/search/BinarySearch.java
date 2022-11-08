package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNum = 8;
        // 중간값 찾기
        int midNum = nums.length/2;
        System.out.println(midNum);

        // 인덱스(시작점, 끝점) 옮기기
        if (midNum < targetNum) {
            midNum = (nums.length + midNum) / 2;
            System.out.println(midNum);
        } else {
            midNum = (nums.length - midNum) / 2;
            System.out.println(midNum);
        }

        // 같은지 비교하기
    }
}
