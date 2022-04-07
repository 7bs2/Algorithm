package skill;

/**
 * @author the sky
 */

// 差分数组
public class Difference {

    // 差分数组
    private int[] diff;

    // 构造差分数组
    public Difference(int[] arr) {
        diff[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }
    }

    // 在指定的区间进行加法操作
    public void increment(int i, int j, int val) {
        diff[i] += val;
        // 在 j+1 的部分将val值
        if (j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    public int[] result() {
        int res[] = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = diff[i] + res[i - 1];
        }
        return res;
    }



}
