package LeetCode;

// 最长连续递增子序列的长度
public class LongestSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 2, 3, 2, 3, 4, 5, 6 , 7};
        System.out.println(findLength(arr));
    }


    public static int findLength(int[] arr) {
        int start = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                max = Math.max(i - start, max);
               start = i;
            }
            if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                max = Math.max(i - start + 1, max);
            }
        }

        return max;
    }

}

// 在一个给定的数值序列中，找到一个子序列，使得这个子序列元素的数值依次递增，
// 并且这个子序列的长度尽可能地大, 返回长度
