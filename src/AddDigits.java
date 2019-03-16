/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-16 22:58
 */
public class AddDigits {
    public int addDigits1(int num) {
        if (num < 10) {
            return num;
        } else {
            int digitsSum = 0;
            while (num > 0) {
                digitsSum += num % 10;
                num /= 10;
            }
            return addDigits1(digitsSum);
        }
    }

    public int addDigits2(int num) {
        if (num < 10) {
            return num;
        } else {
            int res = num % 9;
            return res == 0 ? 9 : res;
        }
    }
}
