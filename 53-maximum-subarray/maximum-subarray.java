class Solution {
    public int maxSubArray(int[] nums) {
    // to print the subarray with max sum 
    //kadane's algo- sum if -ve discard and always initialize with 0 
        
//thing to be taken care of-> tempstart and permstart variable , permstart only assigned when confirmed that sum is > max
       
 //returning array form either choose loop or return Arrays.copyOfRange(nums, startIndex,endIndex+1); 
 // +1 coz exclusive to right 
        int max=Integer.MIN_VALUE;
        int startIndex;
        int tempstart=0;
        int endIndex;
        int sum=0;
        for(int i =0;i<nums.length;i++)
        {

            if(sum==0)
            {
               tempstart=i;//intializing each time i
            }
             sum+=nums[i];

            if(sum>max)
            {
             max=Math.max(max,sum);//storing max value of sum
             startIndex=tempstart;//confirm the prev start only when the sum >max
             endIndex=i;
            }

            if(sum<0)
            {   
                sum=0;
            }
        }
       // return Arrays.copyOfRange(nums,startIndex,endIndex+1);// if they ask subarray then return like this
       return max;//returning max sum

        
    }
}