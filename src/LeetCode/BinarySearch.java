package LeetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(search(arr,3));
    }

    public static int search(int[] arr, int num) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == num) {
                return mid;
            }else if (num > arr[mid]) {
                left = mid + 1;
            }else if (num < arr[mid]) {
                right = mid + 1;
            }
        }
        return -1;
    }
}
