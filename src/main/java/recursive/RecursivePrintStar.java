package recursive;

public class RecursivePrintStar {

    static int count = 1;
    public static int printStar(int n) {
        System.out.print("*");
        if (n == 1) {
            return n;
        }
        return printStar(n - 1);
    }

    public static int printLine(int n) {
        printStar(count);
        System.out.printf("\n%d 출력: ", count + 1);
        printLine(count++);
        if (count > n) return 0;
        return 0;
    }

    public static void main(String[] args) {
        int input = 5;
        printLine(input);
    }

}
