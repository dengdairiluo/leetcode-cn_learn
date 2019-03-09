import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-09 12:23
 */
public class PascalsTriangle {

    // 如图生成篇
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> curList = new ArrayList<>();
            List<Integer> preList = new ArrayList<>();
            if (i > 0) {
                preList = res.get(i - 1);
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curList.add(1);
                } else {
                    curList.add(preList.get(j - 1) + preList.get(j));
                }
            }
            res.add(curList);
        }
        return res;
    }


    //二项式定理篇
    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            long num = 1;
            for (int j = 1; j < i; j++) {
                num = num * (i - j) / j;
                cur.add((int) num);
            }
            res.add(cur);
        }
        return res;
    }
}
