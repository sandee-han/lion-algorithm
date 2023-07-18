package leetcode;

import java.util.Arrays;

// 자바 코딩인터뷰 p396
public class ContainerWithMostWater {
    public static int maxAreaWithBrutalforce(int[] height) {
        int area = 0;
        int width = 0;
        int answer = 0;
        for (int j = 0; j < height.length; j++) {
            for (int i = j + 1;  i < height.length; i++) {
                    width = i - j;
                    area = width * Math.min(height[i], height[j]);
                    answer = Math.max(answer, area);
            }
        }
        return answer;
    }

    public static int maxAreaWithTwoPointer(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int answer = 0;
        int area;

        while(left < right) {
            area = (right - left) * Math.min(height[left], height[right]);
            answer = Math.max(area, answer);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxAreaWithTwoPointer(height));
    }

}
