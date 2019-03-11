import javax.swing.border.SoftBevelBorder;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-11 18:43
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        int m;
        StringBuffer sb = new StringBuffer();
        while (n > 26) {
            if (n % 26 == 0) {
                n = n / 26 - 1;
                sb.append('Z');
            } else {
                m = n % 26;
                n = n / 26;
                sb.append((char) (m + 64));
            }
        }
        sb.append((char) (n + 64));
        return sb.reverse().toString();
    }
}
