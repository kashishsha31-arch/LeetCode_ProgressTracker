class Solution {
    public int maxProfit(int[] prices) 
    {
          int profit=0;
          int min=Integer.MAX_VALUE;
          int maxP=0;
          
          for(int i=0;i<prices.length;i++)
          {
            min=Math.min(min,prices[i]);
            profit=prices[i] -min;
            if(profit>maxP)
            {
                maxP=profit;
            }
          }
return maxP;
    }
}