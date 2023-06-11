import java.util.Arrays;

public class ConcatenationOfArray_1929 {
    public int[] getConcatenation(int[] nums){
        int numsLength = nums.length;
        int[] ans = new int[numsLength * 2];
        for(int i = 0; i < numsLength; i++){
            ans[i] = nums[i];
            ans[i+numsLength] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        ConcatenationOfArray_1929 obj = new ConcatenationOfArray_1929();
//        int[] nums = {1, 2, 1};
        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(obj.getConcatenation(nums)));
    }
}
