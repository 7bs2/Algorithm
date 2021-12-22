package LeetCode;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {

    }


    // 双循环完美解决
    public static int prime1(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            // 算出不是素数的
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
        }
        return n - 1 - count - 1;
    }

    // 埃氏筛  空间换时间 素数*n必然是合数
    public static int prime2(int n) {
        boolean[] isPrime = new  boolean[n];
        int count = 0;
        Arrays.fill(isPrime, true);
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
                // 素数 * 一个数必然是和数4
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return count;
    }

}
