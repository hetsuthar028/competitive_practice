import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums){
        int[] occurrence = new int[101];
        int[] ans = new int[nums.length];
        for(int n: nums){
            occurrence[n]++;
        }
        for(int i = 1; i <= 100; i++){
            occurrence[i] = occurrence[i-1] + occurrence[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 ) {ans[i] = 0;}
            else {
                ans[i] = occurrence[nums[i] - 1];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        HowManyNumbersAreSmallerThanCurrentNumber_1365 obj = new HowManyNumbersAreSmallerThanCurrentNumber_1365();
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
    }
}
