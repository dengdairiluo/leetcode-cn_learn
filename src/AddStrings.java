/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-22 00:08
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int jin = 0, i = num1.length() - 1, j = num2.length() - 1;
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        while (i >= 0 || j >= 0 || jin != 0) {
            if (i >= 0) jin += chars1[i--] - '0';
            if (j >= 0) jin += chars2[j--] - '0';
            sb.append(jin % 10);
            jin /= 10;
        }
        return sb.reverse().toString();

    }
}
