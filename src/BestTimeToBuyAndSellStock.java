/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-10 17:08
 */
public class BestTimeToBuyAndSellStock {

    //dp
    public int maxProfit(int[] prices) {
        int minPrize = Integer.MAX_VALUE;
        int maxProfit = 0;
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            minPrize = Math.min(minPrize, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrize);
        }
        return maxProfit;
    }
}
