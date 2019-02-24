import sun.security.action.PutAllAction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-24 12:43
 */
public class RomanToInt {
    private static Map<Character, Integer> map = new HashMap() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };



    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int nump = map.get(chars[0]);
        int numc;
        int val = nump;
        for (int i = 1; i < chars.length; i++) {
            numc = map.get(chars[i]);
            val += numc;
            if (nump < numc) {
                val -= nump * 2;
            }
            nump = numc;
        }
        return val;
    }
}
