package sort;

public class QuickSortWithArray {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        int tmp;

        while (arr[leftIdx] < pivot) leftIdx += 1;
        while (arr[rightIdx] > pivot) rightIdx -= 1;
        tmp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = tmp;
        leftIdx += 1;
        rightIdx -= 1;



        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

    }
}
