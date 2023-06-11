import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatesNumberOfCandies_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int max = 0;
        List<Boolean> ansList = new ArrayList<>();
        for(int c: candies){
            if(c > max){
                max = c;
            }
        }

        for(int c: candies){
            ansList.add((c + extraCandies >=max));
        }
        return ansList;
    }

    public static void main(String[] args){
        KidsWithTheGreatesNumberOfCandies_1431 obj = new KidsWithTheGreatesNumberOfCandies_1431();
//        int[] candies = {2,3,5,1,3}; //3
//        int[] candies = {4,2,1,1,2}; //1
        int[] candies = {12,1,12};    //10
        System.out.println(obj.kidsWithCandies(candies, 10));
    }
}
