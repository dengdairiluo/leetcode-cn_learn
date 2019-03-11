/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-10 17:15
 */
public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int len = prices.length;
        int totalProfit = 0;
        for (int i = 1; i < len; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > 0) {
                totalProfit += profit;
            }
        }
        return totalProfit;
    }
}
