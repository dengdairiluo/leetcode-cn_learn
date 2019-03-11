/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-10 17:31
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
