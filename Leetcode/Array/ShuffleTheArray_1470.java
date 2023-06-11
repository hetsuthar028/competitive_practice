import java.util.Arrays;

public class ShuffleTheArray_1470 {

    public int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        for(int i = 0; i< n; i++){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }
        return ans;
    }

    public static void main(String[] args){
        ShuffleTheArray_1470 obj = new ShuffleTheArray_1470();
//        int[] nums = {2,5,1,3,4,7};
        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(obj.shuffle(nums, 4)));
    }
}
