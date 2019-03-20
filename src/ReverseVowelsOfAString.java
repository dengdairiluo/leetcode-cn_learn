/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-19 20:33
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if (s.length() == 0) {
            return s;
        }
        String vowels = "AEIOUaeiou";
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            while (l < r && isNotVowel(chars[l])) {
                l++;
            }
            while (l < r && isNotVowel(chars[r])) {
                r--;
            }
            if (l < r && chars[l] != chars[r]) {
                char temp = chars[r];
                chars[r] = chars[l];
                chars[l] = temp;
            }
            l++;
            r--;
        }
        return String.valueOf(chars);
    }

    private boolean isNotVowel(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return false;
        }
        return true;
    }
}
