import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-06 18:29
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (null == digits || digits.length == 0) {
            return new int[0];
        }

        digits[digits.length - 1] +=1;
        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] <10) {
                return digits;
            } else {
                digits[i] -= 10;
                digits[i - 1]++;
            }
        }
        if (digits[0] < 10) {
            return digits;
        } else {
            digits[0] -= 10;
            int[] newDig = new int[digits.length + 1];
            newDig[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newDig[i + 1] = digits[i];
            }
            return newDig;
        }
    }
    public static void main(String[] args) {
        int[] digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(digits)));

    }
}
