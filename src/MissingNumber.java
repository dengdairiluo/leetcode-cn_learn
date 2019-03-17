/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-17 10:31
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = nums.length;
        for (int i = 0; i < len; i++) {
            sum ^= nums[i];
            sum ^= i;
        }
        return sum;
    }
}
