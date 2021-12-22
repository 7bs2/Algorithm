package LeetCode;

import java.util.Arrays;

public class ThreeNumbersFactor {
    public static void main(String[] args) {

    }

    // 对数组排序
    // 若数组中全为正  最大乘积为后三位      若全为负   最大乘积还是后三位
    // 若数组有正负    最后三个正数的乘积 或   前两个负数与最后一个正数的乘积
    // 综上所述    最大三位数的乘积 一定为后三位  或者   前两位加最后一位

    public static int maxFactor(int[] arr) {
        Arrays.sort(arr);
        return Math.max(arr[0] * arr[arr.length - 1] * arr[arr.length - 2],
                arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]);
    }
}
