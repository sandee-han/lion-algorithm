package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNum = 7;
        int startIdx = 0;
        int endIdx = nums.length - 1;
        int midIdx = nums.length / 2;
        int midValue = nums[midIdx];

        if (midValue > targetNum) {
            startIdx = midIdx + 1;
        } else if (midValue < targetNum) {
            endIdx = midIdx - 1;
        }

    }
}
