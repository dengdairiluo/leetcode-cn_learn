import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.collections.transformation.SortedList;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-01 18:21
 */
public class RemoveDuplicates {
    public int removeDuplicates1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = set.size();
        List<Integer> integers = new ArrayList<>();
        integers.addAll(set);
        Collections.sort(integers);

        for (int i = 0; i < n; i++) {
            nums[i] = integers.get(i);
        }
        return n;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[result] != nums[i]) {
                result++;
                nums[result] = nums[i];
            }
        }
        return result + 1;
    }
}
