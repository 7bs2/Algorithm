package leetCode;

public class FibonacciOfSum {
    public static void main(String[] args) {
        System.out.println(fib2(25));
        System.out.println(fib1(25));
    }

    // 斐波拉契数列求和
    // 求数列的第n项   此方法存在多次计算重复值的问题  时间复杂度过高
    public static long fib1(long num) {
       if (num == 1 || num == 2) {
           return 1;
       }
       return fib1(num - 1) + fib1(num - 2);
    }



    // 利用数组去存储相同的值  减少计算的次数
    public static int fib2(int num) {
        int[] arr = new int[num + 1];
        arr[1] = 1;
        arr[2] = 1;
        return fun(arr, num);
    }

    private static int fun(int[] arr, int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        if(arr[num] != 0) {
            return arr[num];
        }else {
            arr[num] = fun(arr, num - 1) + fun(arr, num - 2);
        }
        return arr[num];
    }

}
