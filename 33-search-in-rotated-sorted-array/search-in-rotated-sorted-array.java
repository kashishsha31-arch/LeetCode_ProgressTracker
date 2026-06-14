class Solution {
    public int search(int[] nums, int target) {
        //my idea lies here to solve the prblm using binary seARCH
        //finding mid
        int mid ,left ,right;
        left=0;
        right=nums.length -1;
       
        while(left<=right)
        {
             mid=left +(right-left)/2;
            if(target == nums[mid])
            {
                return mid;
            }
            if(nums[left]<=nums[mid])
            {

            
        if(target>=nums[left] && target <nums[mid])
        {
            //found in left , left part fully sorted
            right =mid-1;
        }
        else 
        {
        //on right part
            left=mid+1;
        }
            }
             else
             {
                if(target<=nums[right] && target>=nums[mid])
                {
                   left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
             }
        }
        return -1;

        }

    }
