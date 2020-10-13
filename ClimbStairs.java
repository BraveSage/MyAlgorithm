/**
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 */
public class ClimbStairs {

    public static int climbStairs(int n) {
        int p = 0, q = 1, r = 1;
        for (int i = 1; i < n; i++){
            p = q;
            q = r;
            r = q + p;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(true && false);
    }
}
