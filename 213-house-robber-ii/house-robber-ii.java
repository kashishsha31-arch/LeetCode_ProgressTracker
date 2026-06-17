class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
         if(n<2)
        {
            return nums[0];
        }

        int skiplast[]=new int[n];
        int skipfirst[]=new int[n];
        //filling both arrays
        for(int i=0;i<n-1;i++)
        {
            skiplast[i]=nums[i];
        }
        for(int i=0;i<n-1;i++)
        {
            skipfirst[i]=nums[i+1];
        }
        int max1=houseofrobber(skiplast);
        int max2=houseofrobber(skipfirst);
        int max=Math.max(max1,max2);
        return max;
    }


    public int houseofrobber(int[] nums)
    {
        int n=nums.length;
        // not 1 element
        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}