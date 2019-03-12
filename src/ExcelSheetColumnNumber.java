/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-12 18:39
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            res = res * 26 + (chars[i] - 64);
        }
        return res;
    }
}
