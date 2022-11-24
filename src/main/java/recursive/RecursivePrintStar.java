package recursive;

public class RecursivePrintStar {

    int count = 1;
    public static int printStar(int n) {
        System.out.print("*");
        if (n == 1) {
            return n;
        }
        return printStar(n - 1);
    }

    public void printLine(int n) {
        printStar(count);
        System.out.println();
        count++;
        if (n == 1) return;
        printLine(n - 1);
    }

    public static void main(String[] args) {
        RecursivePrintStar recursivePrintStar = new RecursivePrintStar();
        int input = 10;
        recursivePrintStar.printLine(input);
    }

}
