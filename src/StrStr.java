/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-04 15:27
 */
public class StrStr {
    public int strStr1(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    //KMP算法
    public int strStr2(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()) {

        }
        int i = 0, j = 0;
        for (i = 0;i < haystack.length(); i++) {
            if (j == needle.length()) {
                return i - needle.length();
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i -= j;
                j = 0;
            }
        }
        if (j == needle.length()) {
            return i - needle.length();
        }
        return -1;
    }

}
