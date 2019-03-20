import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-20 20:56
 */
public class FirstUniqueCharacterInaString {
    public static int firstUniqChar(String s) {
        int[] l = new int[26];
        Arrays.fill(l, 0);
        for (char c : s.toCharArray()) {
            l[c - 'a']++;
        }
        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (l[(chars[i] - 'a')] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


    }
}
