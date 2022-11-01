package primenumber;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
