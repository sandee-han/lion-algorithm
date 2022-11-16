package sort;

public class QuickSortWithArray {
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        int tmp;

        while (arr[leftIdx] < pivot) {
            leftIdx++;
        }
        tmp = pivot;
        pivot = arr[leftIdx];
        arr[leftIdx] = tmp;

        while (arr[rightIdx] > pivot) {
            rightIdx--;
        }
        tmp = pivot;
        pivot = arr[rightIdx];
        arr[rightIdx] = tmp;


    }
}
