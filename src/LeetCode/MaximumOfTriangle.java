package LeetCode;

import java.util.Arrays;

// 三角形最大周长
public class MaximumOfTriangle {
    public static void main(String[] args) {

    }

    // 贪心     只需要两边之和大于最长的那一边
    public static int fun(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length; i >=2 ; i--) {
            if (arr[i - 1] + arr[i-2] > arr[i]) {
                return arr[i - 1] + arr[i-2] + arr[i];
            }
        }
        return -1;
    }

}

//      给定一些正数（代表长度）组成的数组arr，返回由其中三个
//      长度组成的面积不为0的三角形的最大周长。
