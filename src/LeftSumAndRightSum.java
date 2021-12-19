import java.util.Arrays;

//  左侧元素的所有和等于右侧元素的所有和
public class FindLeftSumAndRightSum {

    public static void main(String[] args) {

    }

    public static int find(int[] arr) {
        // 求总和
        int sum = Arrays.stream(arr).sum();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total == sum) {
                return i;
            }
            sum -= arr[i];
        }
        return -1;
    }
}
