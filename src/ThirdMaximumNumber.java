/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-03-22 00:03
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        boolean f=true;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==Integer.MIN_VALUE&&f){
                flag++;
                f=false;
            }
            if(nums[i]>first){
                flag++;
                //原先第二大传递给第三大
                third=second;
                //原先最大值传递给第二大
                second=first;
                //更新最大值
                first=nums[i];
            }else if (nums[i]>second && nums[i]<first){
                flag++;
                third=second;
                second=nums[i];
            } else if( nums[i]>third && nums[i]<second){
                flag++;
                third=nums[i];
            }
        }
        return flag>=3?third:first;
    }
}
