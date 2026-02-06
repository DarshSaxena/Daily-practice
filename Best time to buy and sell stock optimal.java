class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            int price=prices[i];
            min=Math.min(min,price);
            int fprofit=price-min;
            profit=Math.max(fprofit,profit);
        }
        return profit;
    }
    }
           
