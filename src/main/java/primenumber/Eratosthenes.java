package primenumber;

public class Eratosthenes {
    public static void main(String[] args) {
        int num = 2;
        int check = 2;
        for (int i = 2; i <= 100; i++) {
            System.out.printf("%d ", num);
            num++;
        }
        System.out.println();
        for (int i = 2; i <= 102; i+=2) {
            System.out.printf("%d ", check);
            check = i;
        }

    }
}
