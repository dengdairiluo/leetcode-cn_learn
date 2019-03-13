/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-13 19:31
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        while (n >= 10) {
            int m = n, sum = 0;
            while (m != 0) {
                int t = m % 10;
                sum += t * t;
                m /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }
}
