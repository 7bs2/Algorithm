package leetCode;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 0, 0,3,4,0,1,};
        System.out.println(moveZeroes(arr));
    }

    //   快慢指针  将快指针的值去覆盖慢指针的值
    //   不改变原来元素的顺序
    public static int moveZeroes(int[] nums) {
        int slow = 0;
        for (int quick = 0; quick < nums.length; quick++) {
            if (nums[quick] != 0) {
                nums[slow++] = nums[quick];
            }else {
                // 快指针向前走w
            }
        }
        return slow;
    }
}
