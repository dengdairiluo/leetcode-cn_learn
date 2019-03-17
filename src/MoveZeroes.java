/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-17 10:48
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, len = nums.length;
        for (i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < len) {
            nums[j++] = 0;
        }
    }
}
