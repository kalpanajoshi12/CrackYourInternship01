class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int count = 0;
        int smallest = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(prices[i]<smallest){
                smallest = prices[i];
            }else{
                count = prices[i]-smallest;
                profit = Math.max(profit,count);
            }
        }
        return profit;
    }
}