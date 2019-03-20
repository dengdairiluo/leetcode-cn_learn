/**
 * @author jianglub
 * @date 2019/3/19
 */
public class SumOfTwoIntegers {

    //递归
    public static int getSum(int a, int b) {


        int t = a ^ b;         // a异或b 取二进制相加位的结果
        int f = (a & b) << 1;  // a与b 取进制位，并左移一位
        if(f != 0){            // 加上进制位  递归调用 直到进制位为0
            return getSum(t, f);
        }
        return  t;
    }

    public int getSum1(int a, int b) {
        int t;
        while ((t = (a & b)) != 0) {
            a ^= b;
            b = t << 1;
        }
        return a | b;
    }
}
