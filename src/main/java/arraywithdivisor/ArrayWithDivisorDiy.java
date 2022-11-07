package arraywithdivisor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayWithDivisorDiy {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7 ,10};
        List<Integer> list = new ArrayList<>();
        int divisor = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.isEmpty()) {
            list.add(-1);
        } else {
            Collections.sort(list);
        }
        System.out.println(list);
    }
}
