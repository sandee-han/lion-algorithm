package primenumber;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {

    public int solution(int n) {
        ArrayList<Integer> table = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            table.add(i);
        }
        for (int i = 2; i * i < n; i++) {
            for (int j = 0; j < table.size(); j++) {
                if (table.get(j) % i == 0 && table.get(j) > i) {
                    table.remove(j);
                }
            }
            System.out.println(table.toString());
        }
        return table.size();
    }

    public static void main(String[] args) {
        RemoveMultipleOf rmo = new RemoveMultipleOf();
        rmo.solution(300000);

    }

}
