class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int smallest = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(smallest<prices[i]){
                profit = profit+prices[i]-smallest;
            }
            smallest = prices[i];
        }
        return profit;
    }
}