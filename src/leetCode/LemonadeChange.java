package leetCode;

public class LemonadeChange {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 10, 5, 10,5, 10,5, 10,20, 10};
        System.out.println(change(arr));
    }

    // 贪心算法使用  局部最优
    // 5元是最有用的   优先返回10元  将5元保存下来，应对更多的情况
    public static boolean change(int[] arr) {
        // 20元  无论如何都是找不出去的  不用记录
        int five = 0, ten = 0;
        // 遍历数组   更具不同的情况做出应对
        for (int item : arr) {
            if (item == 5) {
                five++;
            }else if (item == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            }else if (item == 20) {
                // 优先将10元处理    5元能够应对更多的情况
                if(five > 0 && ten > 0) {
                    five--;
                    ten--;
                }else if (five >= 3) {
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

}
//    在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
//    顾客排队购买你的产品，一次购买一杯。
//    每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
//    注意，一开始你手头没有任何零钱。
//    如果你能给每位顾客正确找零，返回 true ，否则返回 false 。