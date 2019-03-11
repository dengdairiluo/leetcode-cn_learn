/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-10 17:22
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String regexp = "[^a-zA-Z0-9]|[`]";
        String removedString = s.replaceAll(regexp, "").toUpperCase();
        char[] chars = removedString.toCharArray();
        int len = chars.length;
        int mid = len / 2;

        for (int i = 0; i < mid; i++) {
            if (chars[i] != chars[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
