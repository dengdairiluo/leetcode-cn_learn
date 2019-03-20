/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-20 20:37
 */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int l = 1, r = n;
        int mid = l;
        while (l <= r) {
            mid = l + (r - l) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            } else if (g == 1) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return mid;

    }


    // 只是表示有这个函数而已
    private int guess(int num) {
        return 1;
    }
}
