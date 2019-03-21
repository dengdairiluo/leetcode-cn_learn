/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-21 23:40
 */
public class ConvertNumberToHexadecimal {
    private static final char[] HEX_MAP = "0123456789abcdef".toCharArray();

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (; num != 0; num >>>= 4) {
            int x = num & 0b1111;
            sb.append(HEX_MAP[x]);
        }
        return sb.reverse().toString();
    }
}
