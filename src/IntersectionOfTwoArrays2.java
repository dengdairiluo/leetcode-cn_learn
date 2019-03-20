import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jianglub
 * @date 2019/3/19
 */
public class IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] out = new int[list.size()];
        int llen = list.size();
        for (int k = 0; k < llen; k++) {
            out[k] = list.get(k);
        }
        return out;
    }
}
