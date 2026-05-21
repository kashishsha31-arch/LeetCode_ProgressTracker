class Solution {
    public int search(int[] nums, int target) {
         int s=0;
         int e=nums.length -1;
        return BS(nums,target,s,e);
    }
    public static int BS(int[]nums,int target,int s,int e)

    {
       // bs using recursion
         int mid;
         if(s>e)
         {
            return -1;
         }
         mid=s+(e-s)/2;
         if(nums[mid]==target)
         {
            return mid;
         }
         else if(nums[mid]>target)//look left 
            {
                
                return BS(nums,target,s,mid-1);
            }
            else//look right
            {
                 return BS(nums,target,mid+1,e);
            }
    }
}
