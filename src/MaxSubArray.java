/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-05 19:59
 */
public class MaxSubArray {

    /**
     * 动态规划求最大子串
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {
        int sum = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }

    /**
     * 分治法求最大子串
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        return maxSubArray2(nums, 0, nums.length - 1);
    }

    public int maxSubArray2(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = maxSubArray2(nums, left, mid);
        int maxRight = maxSubArray2(nums, mid + 1, right);
        int sumLeft = 0;
        int maxSumLeft = nums[mid];
        for (int i = mid; i >= left; i--) {
            sumLeft += nums[i];
            if (sumLeft > maxSumLeft) {
                maxSumLeft = sumLeft;
            }
        }

        int sumRight = 0;
        int maxSumRight = nums[mid + 1];
        for (int i = mid + 1; i <= right; i++) {
            sumRight += nums[i];
            if (sumRight > maxSumRight) {
                maxSumRight = sumRight;
            }

        }
        int result = maxLeft > maxRight ? maxLeft : maxRight;
        int maxMid = maxSumLeft + maxSumRight;
        if (maxMid > result) {
            result = maxMid;
        }

        return result;

    }
}
