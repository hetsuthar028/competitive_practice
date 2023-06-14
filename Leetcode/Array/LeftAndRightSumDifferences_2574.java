import java.util.Arrays;

public class LeftAndRightSumDifferences_2574 {
    public int[] leftRightSumDifference(int[] nums){
//        Approach - 1
//        int[] leftSum = new int[nums.length];
//        int[] ans = new int[nums.length];
//
//        int sum = 0;
//        for(int elemIndex = 0; elemIndex < nums.length; elemIndex++){
//            sum += nums[elemIndex];
//            leftSum[elemIndex] = sum;
//        }
//        sum = 0;
//        for(int elemIndex = nums.length - 1; elemIndex >=0; elemIndex--){
//            sum += nums[elemIndex];
//            ans[elemIndex] = Math.abs(sum - leftSum[elemIndex]);
//        }
//
//        return ans;

//        Approach - 2
        int postSum = 0;
        int preSum = 0;
        int[] ans = new int[nums.length];

        for(int n: nums){
            postSum += n;
        }
        for(int elemIndex = 0; elemIndex < nums.length; elemIndex++){
            postSum -= nums[elemIndex];
            ans[elemIndex] = Math.abs(postSum - preSum);
            preSum += nums[elemIndex];
        }
        return ans;
    }
    public static void main(String[] args){
        LeftAndRightSumDifferences_2574 obj = new LeftAndRightSumDifferences_2574();
        int[] nums = {10, 4, 8, 3};
        System.out.println(Arrays.toString(obj.leftRightSumDifference(nums)));
    }
}
