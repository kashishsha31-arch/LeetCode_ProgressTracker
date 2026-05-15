class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;//pointer for unique element
       for(int j=1;j<nums.length;j++)
       {
        if(nums[i]==nums[j])
        {
            continue;
        }
        else
        {
            i++;//jagh bnaya j ke element k liye
            nums[i]=nums[j];
        }

       }
return i+1;
    }
}