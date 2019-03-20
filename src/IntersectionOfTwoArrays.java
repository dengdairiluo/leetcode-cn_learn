import java.util.HashSet;
import java.util.Set;

/**
 * @author jianglub
 * @date 2019/3/19
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<Integer>();
        for (int num : nums2) {
            set2.add(num);
        }
        set1.retainAll(set2);
        int len = set1.size();
        int[] output = new int[len];
        int i = 0;
        for (Integer n : set1) {
            output[i++] = n;
        }
        return output;
    }
}
