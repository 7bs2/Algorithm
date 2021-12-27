package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

   public static void quickSort(int[] arr, int l, int r) {
        if (l > r) return;
        int x = l;
        int y = r;
        int base = arr[x];

        while (x < y) {

            while (arr[y] > base && x < y) {
                y--;
            }

            if (x < y) {
                arr[x++] = arr[y];
            }


            while (arr[x] < base && x < y) {
                x++;
            }


            if (x < y) {
                arr[y--] = arr[x];
            }

        }

        arr[x] = base;
        quickSort(arr, l, x - 1);
        quickSort(arr, x + 1, r);
   }

}
