package sort;

public class QuickSortWithArray {
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        System.out.println(pivot);

        while (arr[leftIdx] < pivot) leftIdx += 1;




    }
}
