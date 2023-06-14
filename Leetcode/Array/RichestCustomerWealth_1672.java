import java.util.Arrays;

public class RichestCustomerWealth_1672 {

    public int maximumWealth(int[][] accounts){
//        Approach - 1 | Takes more time & space
        /*int maxWealth = 0;
        for(int[] customerAccounts: accounts){
            maxWealth = Math.max(maxWealth, (int) Arrays.stream(customerAccounts).reduce((b1, b2) -> b1 + b2).getAsInt());
        }
        return maxWealth;*/

//        Approach - 2 | Takes lesser time & space
        int maxWealth = 0;
        for(int[] customerWealth: accounts){
            int sum = 0;
            for(int b: customerWealth){
                sum +=b;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;


    }

    public static void main(String[] args){
        RichestCustomerWealth_1672 obj = new RichestCustomerWealth_1672();
//        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(obj.maximumWealth(accounts));
    }
}
