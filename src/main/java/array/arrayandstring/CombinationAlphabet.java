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

    public static void twoLetters() {
        char[] array1 = new char[26];
        char[] array2 = new char[26];
        int count1 = 0;

        for (int i = 65; i < 91; i++) {
            int count2 = 0;
            array1[count1] = (char)i;
            count1++;
            for (int j = 65; j < 91; j++) {
                array2[count2] = (char)j;
                System.out.print(array1[count1]);
                System.out.println(array2[count2]);
                count2++;
            }
        }
    }

    public static void main(String[] args) {
        oneLetterRecursive('A');
    }
}
