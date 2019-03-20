/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-20 23:04
 */
public class NthDigit {
    public int findNthDigit(int n) {
        int cnt = 1;
        int sum = 9;
        int tmp = 9;
        int isOverFlow = 0;
        while( n > sum ){
            tmp = tmp*10;
            ++cnt;
            if( sum + tmp*cnt < sum ){
                isOverFlow = 1;
                break;
            }
            sum += tmp*cnt;
        }
        if(isOverFlow == 0 ) sum -= tmp*cnt;
        int num = tmp/9 + (n-sum-1)/cnt;
        int idx = cnt- ((n-sum-1)%cnt+1);
        int res = -1;
        while( idx >= 0 ){
            idx -= 1;
            res = num % 10;
            num = num /10;
        }
        return res;
    }
}
