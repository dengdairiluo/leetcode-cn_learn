/**
 * @author jianglub
 * @date 2019/3/19
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare1(int num) {
        int l = 0 ;
        int r = num;
        int mid = 0;
        while(l <= r){
            mid = (l+r)/2;
            //反向算，防止乘法溢出
            if(mid == (num*1.0/mid))
                return true;
            else if(mid > (num*1.0/mid))
                r = mid-1;
            else
                l = mid+1;
        }
        return false;
    }

    //牛顿逼近法
    public static boolean isPerfectSquare2(int num) {
        int r = num;
        while (r > (num * 1.0 / r)) {
            r = (r + num / r) / 2;
        }
        if (r == (num * 1.0 / r)) {
            System.out.println(r);
            return true;
        }
        return false;
    }

    // n^2 - (n-1)^2 = 2n -1
    public static boolean isPerfectSquare3(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

}
