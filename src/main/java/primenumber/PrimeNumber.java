package primenumber;

public class PrimeNumber {
    public boolean solution1(int num) {
        /*
        1번 방법
        입력 받고 자기보다 작은 수로 나누기
         */
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("not a prime number");
                return false;
            }
        }
        System.out.println("prime number");
        return true;
    }

    public boolean solution2(int num) {
        for (int i = 2; i < (num / 2); i++) {
            if (num % i == 0) {
                System.out.println("not a prime number");
                return false;
            }
        }
        System.out.println("prime number");
        return true;
    }

    public boolean solution3(int num) {
        for (int i = 2; i < (Math.sqrt(num)); i++) {
            if (num % i == 0) {
                System.out.println("not a prime number");
                return false;
            }
        }
        System.out.println("prime number");
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.solution1(13);
        primeNumber.solution1(17);
        primeNumber.solution1(19);
        primeNumber.solution1(23);
    }
}
