package recursive;

public class RecursivePrintStar {
    public static int printStar(int n) {
        System.out.print("*");
        if (n == 1) {
            return n;
        }
        return printStar(n - 1);
    }

    public static void main(String[] args) {
        int input = 5;
        printStar(input);
    }
}
