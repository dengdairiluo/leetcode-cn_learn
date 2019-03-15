/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-15 17:11
 */
public class PowerOfTwo {
    private static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
