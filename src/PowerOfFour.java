import jdk.nashorn.internal.ir.IfNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-18 16:46
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num < 0 || (num & (num - 1)) != 0) {
            return false;
        }
        return (num & 0x55555555) != 0;
    }
}
