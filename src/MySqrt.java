import sun.awt.geom.AreaOp;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-07 18:30
 */
public class MySqrt {

    // 从1开始遍历，过

    // 二分法，过

    // 牛顿迭代法

    public int mySqrt1(int x) {
        if (x < 2) {
            return x;
        }
        double m = (double) x;
        double k = 1;
        while (Math.abs(k - m / k) >= 0.000001) {
            k = (k + m / k) / 2.0;
        }
        return (int)k;
    }

    // 代码未解之谜之神奇的0x5f3759df
    public int mySqrt(int x) {
        long t = x;
        t = 0x5f3759df - (t >> 1);
        while (!(t*t <= x && (t+1)*(t+1) > x)) {
            t = (x/t + t)/2;
        }
        return (int)t;
    }
}
