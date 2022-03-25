package leetCode;

public class RemoveElements {

    // 给你一个数组 和一个值 val，你需要原地移除所有数值等于val 的元素并返回移除后数组的新长度。
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,2,5,6,7};
        System.out.println(removeElement(arr, 2));
    }
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        // left 与 right 相等的情况也需要检测一次
        while (left <= right) {
            // 将right的值给left直到left不等于val
            if (nums[left] == val) {
                nums[left] = nums[right--];
            }else {
                left++;
            }
        }
        return left;
    }
}

//通过首尾指针去解决     **并没有在移除元素的时候保留了元素的顺序**
