package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String number = br.readLine();
        String[] numbers = number.split(" ");
        int searchNumber = Integer.parseInt(br.readLine());
        int cnt = 0;
        int check = 0;

        while (cnt < numbers.length) {
            if (searchNumber == Integer.parseInt(numbers[cnt])) {
                System.out.println(cnt + 1);
                check++;
                break;
            }
            cnt++;
        }
        if (check != 1) System.out.println(-1);
    }
}
