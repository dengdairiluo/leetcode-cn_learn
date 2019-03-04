import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-04 17:38
 */
public class CountAndSay {

    public String countAndSay1(int n) {
        if (n == 1) {
            return "1";
        } else {
            return countString(countAndSay1(n - 1));
        }
    }

    private String countString(String str) {
        char[] chars = str.toCharArray();
        char cur;
        char tar = chars[0];
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            cur = chars[i];
            if (tar == cur) {
                count++;
            } else {
                sb.append(count).append(tar);
                tar = cur;
                count = 1;
            }
        }
        sb.append(count).append(tar);
        return sb.toString();
    }

    public String countAndSay2(int n) {
        if (n == 1) {
            return "1";
        } else {
            return count(countAndSay2(n - 1));
        }
    }

    public String count(String string) {
        String pattern = "(\\d)\\1*";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(string);

        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            sb.append(m.group().length()).append(m.group().charAt(0));

        }
        return sb.toString();
    }

}
