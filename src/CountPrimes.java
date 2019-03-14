import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-14 18:33
 */
public class CountPrimes {

    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        int[] list = new int[n];
        Arrays.fill(list, 1);
        list[0] = 0;
        list[1] = 0;
        for (int i = 2; i * i < n; i++) {
            if (list[i] == 1) {
                for (int j = 2 * i; j < n; j += i) {
                    list[j] = 0;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (list[i] == 1) {
                res++;
            }
        }
        return res;
    }
}
