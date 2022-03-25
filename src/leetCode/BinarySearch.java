package leetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4, 4, 5, 6, 7};
        System.out.println(left_bound(arr, 4) + "ppp");
    }

    // 典型的二分搜索    搜索区间
    public static int search(int[] arr, int num) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (num > arr[mid]) {
                left = mid + 1;
            } else if (num < arr[mid]) {
                right = mid + 1;
            }
        }
        return -1;
    }


    // 寻找左边界
    public static int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] == target) {
                right = mid - 1;
            }
            System.out.println(left);
        }

        // left > nums.length时 没有必要判断后面的数据
        if (left >= nums.length || right < 0) {
            return -1;
        }
        return left;
    }


    public static int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target ) {
                right = mid - 1;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] == target) {
                left = mid + 1;
            }
        }
        if ( right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }


}
