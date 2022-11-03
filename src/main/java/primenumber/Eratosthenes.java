package primenumber;

public class Eratosthenes {
    public static void main(String[] args) {
        int num = 1;
        int check = 0;

        for (int i = 2; i <= 100; i++) {
            check +=2;
            num++;
            System.out.printf("num: %d , check: %d\n", num, check);
        }


    }
}
