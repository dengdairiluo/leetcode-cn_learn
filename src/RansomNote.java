import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-20 20:47
 */
public class RansomNote {
    public boolean canConstruct1(String ransomNote, String magazine) {
        int[] l = new int[26];
        Arrays.fill(l, 0);
        for (char c : magazine.toCharArray()) {
            l[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (l[c-'a'] == 0) return false;
            l[c - 'a']--;
        }
        return true;
    }


}
