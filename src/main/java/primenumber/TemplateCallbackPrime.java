package primenumber;

public class TemplateCallbackPrime {

    boolean someOperation(int a, int b) {
        return a < b;
    }

    boolean isPrime(int num) {
        for (int i = 2; someOperation(i ,num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
