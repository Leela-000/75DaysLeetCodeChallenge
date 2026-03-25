class Solution {
    public int maxProfit(int[] prices) {
       int minInd=0;
       int maxProfit=0;
       for(int i=0;i<prices.length;i++){
        int profit=prices[i]-prices[minInd];
        if(maxProfit<profit){
            maxProfit=profit;
        }
        if(prices[i]<prices[minInd]){
            minInd=i;
        }
       }
        return maxProfit;
    }
}