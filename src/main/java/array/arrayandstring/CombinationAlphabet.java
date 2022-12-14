package array.arrayandstring;

public class CombinationAlphabet {
    public static void oneLetter() {
        char[] array = new char[26];
        int count = 0;
        for (int i = 65; i < 91; i++) {
            array[count] = (char)i;
            System.out.println(array[count]);
            count++;
        }
    }

    public static char oneLetterRecursive(char ch) {
        System.out.println(ch);
        if (ch == (char)90) return ch;
        oneLetterRecursive((char)(ch + 1));
        return ch;
    }

    public static void printAlphabet(String prefix, int depth) {
        if (prefix.length() > depth) return;

        if (prefix.length() == depth) {
            System.out.println(prefix);
        }

        for (char c = 'A'; c <= 'Z' ; c++) {
            printAlphabet(prefix + c, depth);
        }
    }

    public static void main(String[] args) {
//        oneLetterRecursive('A');
        printAlphabet("", 3);
    }
}
