package leetCode;

import java.util.Arrays;

public class ThreeNumbersFactor {
    public static void main(String[] args) {

    }

    // 对数组排序
    // 若数组中全为正  最大乘积为后三位      若全为负   最大乘积还是后三位
    // 若数组有正负    最后三个正数的乘积 或   前两个负数与最后一个正数的乘积
    // 综上所述    最大三位数的乘积 一定为后三位  或者   前两位加最后一位

    public static int maxFactor1(int[] arr) {
        Arrays.sort(arr);
        return Math.max(arr[0] * arr[arr.length - 1] * arr[arr.length - 2],
                arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]);
    }



    // 线性扫描  不使用排序
    public static int maxFactor2(int[] arr) {

        // min1为最小值   min2 为第二小
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE, max2 =  Integer.MIN_VALUE, max3 =  Integer.MIN_VALUE;

        for (int item : arr) {
            // 如果比最小的还要小
            if (item < min1) {
                min2 = min1;
                min1 = item;
            }else if(item < min2) {
                min2 = item;
            }

            // max1为最大   比最大的都要大
            if (item > max1) {
                max3 = max2;
                max2 = max1;
                max1 = item;
            }else if(item > max2) {
                max3 = max2;
                max2 = item;
            }else if (item > max3) {
                max3 = item;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
