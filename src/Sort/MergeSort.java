package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,21,7,1,13,9};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        // 递归结束
        if (l >= r) return;

        // 二路递归
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // 合并成有序数组
        merger(arr, l, mid + 1, r);
    }

    private static void merger(int[] arr, int l, int mid, int r) {
        // 只有在最后一次才会用到  arr.length的长度
        // tmp数组的位置与原数组是一一对应的
        int[] tmp = new int[arr.length];
        int iterator = mid;
        // tmp 数组的指针
        int tmpIndex = l;
        // 将tmp 复制给原数组指针
        int copyIndex = l;
        while (l < mid && iterator <= r ) {
            if (arr[l] < arr[iterator]) {
                tmp[tmpIndex++] = arr[l++];
            }else {
                tmp[tmpIndex++] = arr[iterator++];
            }
        }

        while (l < mid) {
            tmp[tmpIndex++] = arr[l++];
        }

        while (iterator <= r) {
            tmp[tmpIndex++] = arr[iterator++];
        }


        while (copyIndex <= r) {
            arr[copyIndex] = tmp[copyIndex];
            copyIndex++;
        }
    }


}
