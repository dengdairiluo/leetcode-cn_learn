/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-22 23:27
 */
public class NumberOfSegmentsInaString {

    public int countSegments(String s) {
        if (s.trim().length() == 0) {
            return 0;
        }
        String[] strings = s.split(" ");
        int sLen = strings.length;
        int i = 0;
        int res = 0;
        while (i < sLen) {
            if (!strings[i].isEmpty()) {
                res++;
            }
            i++;
        }
        return res;
    }
}
