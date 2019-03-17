import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-17 10:54
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        char[] chars = pattern.toCharArray();
        String[] words = str.split(" ");
        if (chars.length != words.length) {
            return false;
        }

        int len = words.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(chars[i])) {
                if (!map.get(chars[i]).equals(words[i])) {
                    return false;
                }
            } else if (map.containsValue(words[i])) {
                return false;
            } else {
                map.put(chars[i], words[i]);
            }
        }
        return true;
    }
}
