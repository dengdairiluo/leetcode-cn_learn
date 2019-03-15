/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-15 10:56
 */
public class BitAnd2BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int n = 0;
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 1) {
                n++;
            } else {
                break;
            }
        }
        return n % 2 == 0;
    }
}
