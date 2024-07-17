class Solution {
    public int maxProfit(int[] prices) {
          int maxProfit = 0;
        int minBuy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }

        return maxProfit; 
    }
}
