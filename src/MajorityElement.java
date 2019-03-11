import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-11 19:00
 */
public class MajorityElement {
    //众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
