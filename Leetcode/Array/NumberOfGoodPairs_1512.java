import java.util.HashMap;

public class NumberOfGoodPairs_1512 {

    public int numIdenticalPairs(int[] nums){
//        Approach - 1
        /*int ans = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    ans +=1;
                }
            }
        }
        return ans;*/

//        Approach - 2
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int ans = 0;
        for(int n: nums){
            int count = hMap.getOrDefault(n, 0);
            ans +=count;
            hMap.put(n, count +1);
        }
        return ans;
    }
    public static void main(String[] args){
        NumberOfGoodPairs_1512 obj = new NumberOfGoodPairs_1512();
//        int[] nums = {1,2,3,1,1,3};
        int[] nums = {1,1,1,1};
//        int[] nums = {1,2,3};
        System.out.println(obj.numIdenticalPairs(nums));
    }
}
