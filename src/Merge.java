/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-07 19:36
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int mi = m - 1;
        int ni = n - 1;
        while (mi >= 0 && ni >= 0) {
            if (nums1[mi] > nums2[ni]) {
                nums1[i--] = nums1[mi--];
            } else {
                nums1[i--] = nums2[ni--];
            }
        }
        while (ni >= 0) {
            nums1[i--] = nums2[ni--];
        }
    }
}
