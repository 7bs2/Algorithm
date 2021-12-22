package LeetCode;

public class DeleteOrderArrayItem {
    public static void main(String[] args) {

    }


    public static int fun (int[] arr) {
        int slow = 0;
        for (int quick = 1; quick < arr.length; quick++) {
            if (arr[slow] != arr[quick]) {
                arr[++slow] = arr[quick];
            }
        }
        return slow + 1;
    }
}
