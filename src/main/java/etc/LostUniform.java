package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LostUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            lostList.add(lost[i]);
            reserveList.add(reserve[i]);
        }

        for (int i = 0; i < reserve.length; i++) {
            if (lostList.contains(reserve[i])) {
                lostList.remove(Integer.valueOf(reserve[i]));
                reserveList.remove(Integer.valueOf(reserve[i]));
            }
        }
        Integer[] removedReserve = reserveList.toArray(new Integer[reserveList.size()]);

        for (int i = 0; i < removedReserve.length; i++) {
            // reserve 친구가 lost 한 경우
            if (lostList.contains((removedReserve[i] - 1))) {
                lostList.remove(Integer.valueOf((removedReserve[i] - 1)));
            } else if (lostList.contains((removedReserve[i] + 1))) {
                lostList.remove(Integer.valueOf((removedReserve[i] + 1)));
            }
        }
        return (n - lostList.size());
    }

    public static void main(String[] args) {
        int[] lost = {1, 2, 5, 6, 10, 12, 13};
        int[] reserve = {2, 3, 4, 5, 7, 8, 9, 10, 11, 12};
        LostUniform lostUniform = new LostUniform();
        System.out.println(lostUniform.solution(13, lost, reserve));
    }
}
