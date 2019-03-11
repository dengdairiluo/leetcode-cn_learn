import java.awt.font.NumericShaper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-11 18:36
 */
public class TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int total;
        while (l < r) {
            total = numbers[l] + numbers[r];
            if (target == total) {
                return new int[]{l + 1, r + 1};
            } else if (target > total) {
                l++;
            } else {
                r--;
            }
        }
        return null;
    }
}

