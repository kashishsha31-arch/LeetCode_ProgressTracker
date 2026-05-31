class Solution {
    public int buyChoco(int[] prices, int money) {
        // as a customer i will try to buy the chocolates at a very low prices and more in qty 
        // given  prices -> various chocolates prices
        // money-> initial amount which i have carried along with me 
        // condn -> to buy exactly 2 choco  money>0 && minimize the prices of two chocoltes 
        // to return leftover money , if no way that oney !> 0  return money 
           Arrays.sort(prices);

        int i=0;
        int j=1;// we already know atleast 2 choco are definitely given to us as. a test case 
        int sum=prices[i]+prices[j];
   // what i feel is we need to store  and calculate the minimum
   if(sum>money)
   {
    return money;
   }
   else
   {
    return money-sum;
   }
         
    }
}