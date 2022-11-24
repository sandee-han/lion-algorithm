package recursive;

public class RecursivePrintStar {

    int count = 1;

    // 라인 하나에 n 만큼 별 찍기
    public static int printStar(int n) {
        System.out.print("*");

        // n이 1이 될 경우 1을 리턴함으로 재귀 탈출
        if (n == 1) {
            return n;
        }
        return printStar(n - 1);
    }

    public void printLine(int n) {
        // count 출력 후 줄바꿈
        printStar(count);
        System.out.println();

        // count + 1 처리
        count++;

        // n이 1이 될 경우 재귀 탈출
        if (n == 1) return;

        // n을 하나씩 빼가며 재귀 호출. 1번 호출할 때마다 count는 1씩 증가.
        // n = 1이 될 때 count == input 이 됨.
        printLine(n - 1);
    }

    public static void main(String[] args) {
        RecursivePrintStar recursivePrintStar = new RecursivePrintStar();
        int input = 10;
        recursivePrintStar.printLine(input);
    }

}
