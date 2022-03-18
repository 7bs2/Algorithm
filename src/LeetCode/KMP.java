package LeetCode;

public class KMP {
    public static void main(String[] args) {

    }

    public static  void getNext(int[] next, String str) {
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < str.length(); i++) {

            while( j > 0 && str.charAt(j) != str.charAt(i)) {
                j = next[j - 1];
            }

            if(str.charAt(i) == str.charAt(j)) {
                j++;

            }
            next[i] = j;
        }
    }

    public static  int search(String mode, String str) {
        if (str.length() == 0) return 0;
        int[] next = new int[str.length()];
        getNext(next, str);
        int j = 0;
        for (int i = 0; i < mode.length(); i++) {
            while (j > 0 && mode.charAt(i) != str.charAt(j)) {
                j = next[ j -1];
            }
            if (mode.charAt(i) == str.charAt(j)) {
                j++;
            }

            if (j == str.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }
}
