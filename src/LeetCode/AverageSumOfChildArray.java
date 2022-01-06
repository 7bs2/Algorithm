package LeetCode;

public class AverageSumOfChildArray {

    // 最大 连续 子数组 平均和           滑动窗口
    public static void main(String[] args) {
        int[] arr = new int[] {2, -3, 5 , 6 , 6 ,7};
        System.out.println(fun(arr, 2));
    }


    public static double fun(int[] arr, int k) {

        // 计算第一个窗口
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            max = Math.max(max, sum);
        }

        return max * 1.0 / k;
    }

}
