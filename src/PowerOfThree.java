/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-18 16:26
 */
public class PowerOfThree {
    public boolean isPowerOfThree1(int n) {
        while (n % 3 == 0 && n > 10) {
            n /= 3;
        }
        return n == 3 || n == 9;
    }

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467%n == 0;

    }
}
