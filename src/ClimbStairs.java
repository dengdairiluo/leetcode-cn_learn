/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-07 18:57
 */
public class ClimbStairs {

    public static int climbStairs(int n) {
        int[] dp=new int[n+2];//从0阶到n+1阶
        dp[1]=1;
        dp[2]=1;
        for(int i=1;i<n;i++)
        {
            dp[i+1]+=dp[i];
            dp[i+2]+=dp[i];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        climbStairs(10);
    }
}
