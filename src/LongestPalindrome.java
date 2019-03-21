import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-21 23:50
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] cnts = new int[58];
        Arrays.fill(cnts, 0);
        int sLen = s.length();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sLen; i++) {
            cnts[sChars[i] - 'A']++;
        }
        int res = 0;
        for (int cnt : cnts) {
            res += (cnt/2) * 2;
        }
        if (res < s.length()) {
            res++;
        }
        return res;
    }
}
