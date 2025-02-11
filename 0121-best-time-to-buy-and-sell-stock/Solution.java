class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyDay) {
                buyDay = prices[i];
            } else {
                result = Math.max(prices[i] - buyDay, result);
            }
        }

        return result;
    }
}