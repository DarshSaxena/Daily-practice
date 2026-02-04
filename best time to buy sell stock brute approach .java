class Solution {
    public int maxProfit(int[] prices) {
        int maximum=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                 int profit=prices[j]-prices[i];
                maximum=Math.max(maximum,profit);
            }
    
        }
         return maximum;
    }
}
