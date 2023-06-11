public class FinalValueOfVariableAfterPerformingOperations_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(int i = 0; i< operations.length; i++ ){
            switch (operations[i]){
                case "++X":
                case "X++":
                    ans+=1;
                    break;
                case "--X":
                case "X--":
                    ans -=1;
                    break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        FinalValueOfVariableAfterPerformingOperations_2011 obj = new FinalValueOfVariableAfterPerformingOperations_2011();
//        String[] operations = {"--X","X++","X++"};
//        String[] operations = {"++X","++X","X++"};
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(obj.finalValueAfterOperations(operations));
    }
}
