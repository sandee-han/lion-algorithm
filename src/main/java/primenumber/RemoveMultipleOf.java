package primenumber;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {

    int N = 50;

    public ArrayList<Integer> putNumber(ArrayList<Integer> table) {
        for (int i = 2; i < 50; i++) {
            table.add(i);
        }
        return table;
    }

    public ArrayList<Integer> removeMultipleOfTwo(ArrayList<Integer> table) {
        for (int i = 2; i < table.size(); i++) {
            if (table.get(i) % 2 == 0) {
                table.remove(i);
            }
        }
        return table;
    }

    public void show(ArrayList<Integer> table) {
        System.out.println("size of table = " + table.size());
        for (Integer integer : table) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        int N = 50;
        ArrayList<Integer> table = new ArrayList<>();

        RemoveMultipleOf rmo = new RemoveMultipleOf();
        rmo.putNumber(table);
        rmo.removeMultipleOfTwo(table);
        rmo.show(table);
    }

}
