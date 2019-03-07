/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-07 19:11
 */
public class Fib {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        int[] dp=new int[N+2];//从0阶到n+1阶
        dp[0]=0;
        dp[1]=1;
        for(int i = 0;i<N;i++)
        {
            dp[i+1]+=dp[i];
            dp[i+2]+=dp[i];
        }

        return dp[N];
    }
}
