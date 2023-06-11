import java.util.Arrays;

public class BuildArrayFromPermutation_1920 {

    public int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args){
        BuildArrayFromPermutation_1920 a = new BuildArrayFromPermutation_1920();
        int[] nums = {0,2,1,5,3,4};
        int[] nums2 = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(a.buildArray(nums)));
        System.out.println(Arrays.toString(a.buildArray(nums2)));

    }
}