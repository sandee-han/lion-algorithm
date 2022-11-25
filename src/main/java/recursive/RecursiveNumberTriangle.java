package recursive;

public class RecursiveNumberTriangle {
    public static void printNums(int n) {
        if (n == 0) return;
        printNums(n - 1); // 먼저 작은 숫자를 호출해서 스택에 넣어줍니다.
        System.out.println("n까지 숫자를 출력");
    }

    public static String getNums(int n) {
        // n까지의 숫자를 만든다
        if(n == 1) return "1";
        return getNums(n - 1) + " " + n;  // 더 작은 숫자가 먼저 나오게 처리 함
    }
}
