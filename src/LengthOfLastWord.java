/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-06 18:24
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if ("".equals(s) || null == s) {
            return 0;
        }
        String str = s.trim();
        String[] strs = str.split(" ");
        return strs[strs.length - 1].length();
    }
}
