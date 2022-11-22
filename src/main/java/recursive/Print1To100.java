package recursive;

public class Print1To100 {
    public static void print1To100(int n) {
        int sum = 0;
        sum = sum + n;
        if(n > 100) return;
        System.out.println(sum);
        print1To100(n + 1);
    }

    public static void main(String[] args) {
        print1To100(1);
    }
}
