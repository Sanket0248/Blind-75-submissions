class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for(int sell = 1; sell < prices.length; sell++){
            maxProfit = Math.max(maxProfit, prices[sell] - buy);
            buy = Math.min(prices[sell],buy);
        }
        return maxProfit;
    }
} 
