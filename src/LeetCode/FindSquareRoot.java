package LeetCode;

public class FindSquareRoot {


    // 比如输入 10  输出 3    因为   3*3 = 9 < 10
    public static void main(String[] args) {
        System.out.println(find(17));
    }

    // 暴力算法 在 1  ~~ num -1 之间 一个一个尝试
    public static int find(int num) {
        for (int i = 1; i < num; i++) {
            if (i * i == num) {
                return  i;
            }
            if ((i + 1) * (i + 1) > num) {
                return i;
            }
        }
        return -1;
    }


    // 优化思路二分查找
    public static int find2(int num) {
        return 0;
    }
}
