package search;

public class BinarySearchDIY {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNum = 8;
        // 중간값 찾기
        int midNum = nums.length/2;
        System.out.println(nums[midNum]);

        // 인덱스(시작점, 끝점) 옮기기
        while (nums[midNum] != targetNum){
            if (nums[midNum] < targetNum) {
                midNum = (nums.length + midNum) / 2;
                System.out.println(nums[midNum]);
            } else {
                midNum = (nums.length - midNum) / 2;
                System.out.println(nums[midNum]);
            }
        }
        System.out.println("final:" + nums[midNum]);

        /*
        refactoring
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int targetNum = Integer.parseInt(br.readLine());
        String inputArray = br.readLine();
        String[] array = inputArray.split(" ");

        // 중간값 찾기
        int midNum = array.length/2;
         */

    }
}
