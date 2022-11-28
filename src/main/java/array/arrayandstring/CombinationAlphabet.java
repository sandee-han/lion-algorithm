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

    public static void twoLetters() {
        char[] array1 = new char[26];
        char[] array2 = new char[26];
        int count;
        for (int i = 65; i < 91; i++) {
            count = i - 65;
            array1[count] = (char)i;
            System.out.print(array1[count]);
            for (int j = 65; j < 91; j++) {
                array2[count] = (char)j;
                System.out.println(array2[count]);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        oneLetter();
        twoLetters();
    }
}
