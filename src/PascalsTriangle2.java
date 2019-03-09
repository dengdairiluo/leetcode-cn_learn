import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-09 12:47
 */
public class PascalsTriangle2 {

    //二项式定理，脏死于各种临界值
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        res.add(1);
        if (rowIndex == 0) {
            return res;
        }
        int len = rowIndex + 1;
        long num = 1;
        for (int j = 1; j < len; j++) {
            num = num * (len - j) / j;
            res.add((int) num);
        }
        return res;
    }
}
